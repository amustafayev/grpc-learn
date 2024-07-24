package az.example.org.grpcdemo.controller;

import io.grpc.stub.StreamObserver;
import org.example.grpc.flow_control.FlowControlServiceGrpc;
import org.example.grpc.flow_control.Output;
import org.example.grpc.flow_control.RequestSize;

import java.util.stream.IntStream;

public class FlowControlController extends FlowControlServiceGrpc.FlowControlServiceImplBase {

    //Accepted Parameter is for response
    //Return type is handler for request
    @Override
    public StreamObserver<RequestSize> getMessages(StreamObserver<Output> responseObserver) {
        return new RequestHandler(responseObserver);
    }

    private static class RequestHandler implements StreamObserver<RequestSize> {

        private final StreamObserver<Output> responseObserver;
        private Integer emitted;

        private RequestHandler(StreamObserver<Output> responseObserver) {
            this.responseObserver = responseObserver;
            emitted = 0;
        }


        @Override
        public void onNext(RequestSize requestSize) {
            //When you received message from input stream observer(client);
            IntStream.range(emitted + 1, 100)
                    .limit(requestSize.getSize())
                    .forEach(i -> {
                        System.out.println("Emitting: " + i);
                        //You write response to output stream observer
                        responseObserver.onNext(Output.newBuilder().setValue(i).build());
                    });
            emitted += requestSize.getSize();
            if (emitted >= 100) {
                responseObserver.onCompleted();
            }
        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onCompleted() {
            //If client says Iam completed closing connection, server also close it.
            this.responseObserver.onCompleted();
        }
    }
}
