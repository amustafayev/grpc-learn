package az.example.org.grpcdemo.controller;

import io.grpc.stub.StreamObserver;
import org.example.grpc.bank_app.AccountBalance;
import org.example.grpc.bank_app.TransferRequest;
import org.example.grpc.bank_app.TransferResponse;
import org.example.grpc.bank_app.TransferState;

public class TransferRequestHandler implements StreamObserver<TransferRequest> {


    private final StreamObserver<TransferResponse> responseObserver;

    public TransferRequestHandler(StreamObserver<TransferResponse> responseObserver) {
        this.responseObserver = responseObserver;
    }


    @Override
    public void onNext(TransferRequest transferRequest) {

        responseObserver.onNext(TransferResponse.newBuilder()
                        .setFromAccount(AccountBalance.newBuilder().build())
                        .setToAccount(AccountBalance.newBuilder().build())
                        .setStatus(TransferState.SUCCESS)
                .build());

    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error: " + throwable.getMessage());
    }

    @Override
    public void onCompleted() {
        responseObserver.onCompleted();
    }
}
