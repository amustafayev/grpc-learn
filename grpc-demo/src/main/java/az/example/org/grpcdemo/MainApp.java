package az.example.org.grpcdemo;

import az.example.org.grpcdemo.controller.BankAccountController;
import az.example.org.grpcdemo.server.GrpcServer;

public class MainApp {
    public static void main(String[] args) {
        GrpcServer grpcServer = GrpcServer.create(new BankAccountController());
        grpcServer.start();
        grpcServer.await();
    }
}