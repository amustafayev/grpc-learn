package az.example.org.grpcdemo;

import az.example.org.grpcdemo.controller.BankAccountController;
import az.example.org.grpcdemo.controller.FindNumberGameController;
import az.example.org.grpcdemo.controller.FlowControlController;
import az.example.org.grpcdemo.controller.TransferController;
import az.example.org.grpcdemo.server.GrpcServer;

public class MainApp {
    public static void main(String[] args) {
        GrpcServer grpcServer = GrpcServer.create(new BankAccountController(),
                new TransferController(), new FlowControlController(),
                new FindNumberGameController());
        grpcServer.start();
        grpcServer.await();
    }
}
