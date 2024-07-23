package az.example.org.grpcdemo.controller;

import io.grpc.stub.StreamObserver;
import org.example.grpc.bank_app.TransferRequest;
import org.example.grpc.bank_app.TransferResponse;
import org.example.grpc.bank_app.TransferServiceGrpc;

public class TransferController extends TransferServiceGrpc.TransferServiceImplBase {

    @Override
    public StreamObserver<TransferRequest> transfer(StreamObserver<TransferResponse> responseObserver) {
        return new TransferRequestHandler(responseObserver);
    }
}
