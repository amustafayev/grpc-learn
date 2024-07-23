package az.example.org;

import az.example.org.service.BankAccountServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
                .addService(new BankAccountServiceImpl())
                .addService(ProtoReflectionService.newInstance())
                .build();
        System.out.println("Starting server...");

        server.start();
        server.awaitTermination();
    }
}
