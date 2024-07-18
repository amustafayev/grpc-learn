package az.example.org.grpcserver.controller;

import com.example.grpc.HelloRequest;
import com.example.grpc.HelloResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloControllerGrpc extends com.example.grpc.MyHelloServiceGrpc.MyHelloServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println(request.getName());

        responseObserver.onNext(
                HelloResponse
                        .newBuilder()
                        .setMessage("Hello " + request.getName())
                        .build()
        );
        responseObserver.onCompleted();

    }
}
