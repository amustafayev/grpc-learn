package az.example.org.grpcdemo.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.grpc.bank_app.AccountBalance;
import org.example.grpc.bank_app.BankAccountRequest;
import org.example.grpc.bank_app.BankServiceGrpc;

public class GrpcClient {

    public static void main(String[] args) {


        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();


//        BankServiceGrpc.BankServiceBlockingStub stub = BankServiceGrpc
//                .newBlockingStub(channel);

        BankServiceGrpc.BankServiceStub bankServiceStub = BankServiceGrpc
                .newStub(channel);

        System.out.println("Call starting...");

         bankServiceStub.getAccountBalance(
                BankAccountRequest
                        .newBuilder()
                        .setAccountId(32)
                        .build(),
                 new StreamObserver<AccountBalance>() {
                     @Override
                     public void onNext(AccountBalance accountBalance) {
                         System.out.println(accountBalance);
                     }

                     @Override
                     public void onError(Throwable throwable) {
                         System.out.println("Error: " + throwable.getMessage());
                     }

                     @Override
                     public void onCompleted() {
                         System.out.println("Done!");
                     }
                 }
        );

        try {
            //wait for the listener!
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
