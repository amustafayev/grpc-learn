package az.example.org.grpcdemo.controller;

import com.google.common.util.concurrent.Uninterruptibles;
import io.grpc.stub.StreamObserver;
import org.example.grpc.flow_control.Output;
import org.example.grpc.flow_control.RequestSize;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ResponseHandler implements StreamObserver<Output> {

    private final CountDownLatch latch = new CountDownLatch(1);
    private int size;
    private StreamObserver<RequestSize> requestObserver;

    @Override
    public void onNext(Output output) {

        this.size--;
        processMessage(output);
        if (size == 0) {
            System.out.println("-------------------------------------");
            this.request(3);
        }
    }

    private void processMessage(Output output) {
        System.out.println("Received: " + output);
        Uninterruptibles.sleepUninterruptibly(
                ThreadLocalRandom.current().nextInt(50,200),
                TimeUnit.MILLISECONDS
        );
    }

    @Override
    public void onError(Throwable throwable) {
        latch.countDown();
    }

    @Override
    public void onCompleted() {
        this.requestObserver.onCompleted();
        System.out.println("Completed!");
        latch.countDown();
    }

    public void setRequestObserver(StreamObserver<RequestSize> requestObserver) {
        this.requestObserver = requestObserver;
    }

    private void request(int size){
        System.out.println("requesting size " + size);
        this.size = size;
        this.requestObserver.onNext(RequestSize.newBuilder().setSize(size).build());
    }

    public void await(){
        try {
            this.latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

    public void start(){
        this.request(3);
    }
}
