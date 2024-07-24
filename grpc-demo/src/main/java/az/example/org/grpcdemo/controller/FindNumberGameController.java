package az.example.org.grpcdemo.controller;

import io.grpc.stub.StreamObserver;
import org.example.grpc.game.GuessNumberGrpc;
import org.example.grpc.game.GuessRequest;
import org.example.grpc.game.GuessResponse;
import org.example.grpc.game.Result;

public class FindNumberGameController extends GuessNumberGrpc.GuessNumberImplBase {

    private static final Integer NUMBER = 34;

    @Override
    public StreamObserver<GuessRequest> makeGuess(StreamObserver<GuessResponse> responseObserver) {
        return new GuessNumberHandler(responseObserver);
    }

    private static class GuessNumberHandler implements StreamObserver<GuessRequest> {

        private final StreamObserver<GuessResponse> responseObserver;
        private Integer attempt = 0;

        private GuessNumberHandler(StreamObserver<GuessResponse> responseObserver) {
            this.responseObserver = responseObserver;
        }


        @Override
        public void onNext(GuessRequest guessRequest) {
            System.out.println("Client trying to guess " + guessRequest);
            this.attempt++;
            if (guessRequest.getGuess() == NUMBER) {
                responseObserver.onNext(
                        GuessResponse
                                .newBuilder()
                                .setAttempt(attempt)
                                .setResult(Result.CORRECT)
                                .build()
                );

                System.out.println("Client guessed! Completing!");
                responseObserver.onCompleted();
            } else if (guessRequest.getGuess() > NUMBER) {
                responseObserver.onNext(
                        GuessResponse
                                .newBuilder()
                                .setAttempt(attempt)
                                .setResult(Result.TOO_HIGH)
                                .build()
                );
            } else {
                responseObserver.onNext(
                        GuessResponse
                                .newBuilder()
                                .setAttempt(attempt)
                                .setResult(Result.TOO_LOW)
                                .build()
                );

            }
        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onCompleted() {
            System.out.println("Client closing connection!");
            this.responseObserver.onCompleted();
        }
    }
}
