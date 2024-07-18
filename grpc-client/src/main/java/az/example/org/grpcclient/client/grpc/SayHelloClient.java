package az.example.org.grpcclient.client.grpc;

import com.example.grpc.HelloResponse;
import com.example.grpc.MyHelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SayHelloClient {

    @GrpcClient("myHelloService")
    private MyHelloServiceGrpc.MyHelloServiceBlockingStub myServiceStub;
//    @GrpcClient("myHelloService")
//    private MyHelloServiceGrpc.MyHelloServiceStub myServiceStub;

    @EventListener(ContextRefreshedEvent.class)
    public void callSayHelloServer() {
//
//        StreamObserver<HelloResponse> responseObserver = new StreamObserver<HelloResponse>() {
//
//            @Override
//            public void onNext(HelloResponse helloResponse) {
//                System.out.println(helloResponse.getMessage());
//            }
//
//            @Override
//            public void onError(Throwable throwable) {
//                System.out.println("errror");
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("Done client!");
//            }
//        };
//
//        com.example.grpc.HelloRequest request = com.example.grpc.HelloRequest
//                .newBuilder()
//                .setName("Afgan")
//                .build();
//
//        myServiceStub.sayHello(request, responseObserver);


        System.out.println("Client working...");

        com.example.grpc.HelloRequest request = com.example.grpc.HelloRequest
                .newBuilder()
                .setName("Afgan")
                .build();

        HelloResponse helloResponse = myServiceStub.sayHello(request);

        System.out.println(helloResponse.getMessage());

    }
}
