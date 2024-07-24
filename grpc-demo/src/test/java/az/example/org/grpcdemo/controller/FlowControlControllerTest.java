package az.example.org.grpcdemo.controller;


import az.example.org.grpcdemo.common.AbstractChannelTest;
import az.example.org.grpcdemo.server.GrpcServer;
import io.grpc.stub.StreamObserver;
import org.example.grpc.flow_control.FlowControlServiceGrpc;
import org.example.grpc.flow_control.RequestSize;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FlowControlControllerTest extends AbstractChannelTest {

    private final GrpcServer grpcServer = GrpcServer.create(new FlowControlController());
    private FlowControlServiceGrpc.FlowControlServiceStub stub;

    @BeforeAll
    public void setup() {
        this.grpcServer.start();
        this.stub = FlowControlServiceGrpc.newStub(channel);
    }

    @AfterAll
    public void teardown() {
        this.grpcServer.stop();
    }

    @Test
    public void testFlowControl() {

        ResponseHandler responseHandler = new ResponseHandler();
        StreamObserver<RequestSize> requestObserver = stub.getMessages(responseHandler);

        responseHandler.setRequestObserver(requestObserver);
        responseHandler.start();
        responseHandler.await();


    }
}
