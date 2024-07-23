package az.example.org.grpcdemo.controller;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.example.grpc.bank_app.AccountBalance;
import org.example.grpc.bank_app.AllAccounts;
import org.example.grpc.bank_app.BankAccountRequest;
import org.example.grpc.bank_app.BankServiceGrpc;
import org.example.grpc.bank_app.WithdrawRequest;
import org.example.grpc.bank_app.WithdrawResponse;

public class BankAccountController extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getAccountBalance(BankAccountRequest request, StreamObserver<AccountBalance> responseObserver) {

        System.out.println("Account id: " + request.getAccountId());

        AccountBalance accountBalanceBuilder = AccountBalance.newBuilder()
                .setBalance(10 * request.getAccountId())
                .setCurrency("AZN")
                .setOwnerName("Afgan")
                .build();

        responseObserver.onNext(accountBalanceBuilder);
        responseObserver.onCompleted();
    }

    @Override
    public void getAccounts(Empty request, StreamObserver<AllAccounts> responseObserver) {

        responseObserver.onNext(AllAccounts.newBuilder().build());

        responseObserver.onCompleted();

    }

    @Override
    public void withdraw(WithdrawRequest request, StreamObserver<WithdrawResponse> responseObserver) {

        System.out.println("Withdrawing money from account: " + request.getAccountId());

        for (int i = 0; i < request.getAmount() / request.getPartition(); i++) {
            responseObserver.onNext(WithdrawResponse.newBuilder()
                    .setAmount(200)
                    .setOrder(i)
                    .build());
        }
        responseObserver.onCompleted();
    }
}
