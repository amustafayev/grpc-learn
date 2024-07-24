package az.example.org.grpcdemo.common;

import az.example.org.grpcdemo.controller.FlowControlController;
import az.example.org.grpcdemo.controller.TransferController;
import az.example.org.grpcdemo.server.GrpcServer;
import org.example.grpc.flow_control.FlowControlServiceGrpc;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractTest extends AbstractChannelTest {

    private final GrpcServer grpcServer = GrpcServer.create(new FlowControlController(),new TransferController());
    protected FlowControlServiceGrpc.FlowControlServiceBlockingStub blockingStub;

    @BeforeAll
    public void setUp() {
        this.grpcServer.start();
        this.blockingStub = FlowControlServiceGrpc.newBlockingStub(channel);
    }

    @AfterAll
    public void tearDown() {
        this.grpcServer.stop();
    }


}
