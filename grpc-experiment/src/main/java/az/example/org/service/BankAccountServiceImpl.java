package az.example.org.service;


import io.grpc.stub.StreamObserver;
import org.example.grpc.grpc_service.AccountBalance;
import org.example.grpc.grpc_service.BankAccountRequest;
import org.example.grpc.grpc_service.BankServiceGrpc;

public class BankAccountServiceImpl  extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getAccountBalance(BankAccountRequest request, StreamObserver<AccountBalance> responseObserver) {

        int requestId = request.getRequestId();

        System.out.println("requestId: " + requestId);

        AccountBalance response = AccountBalance.newBuilder()
                .setBalance(3.4f)
                .setCurrency("AZN")
                .setOwnerName("Afgan")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
