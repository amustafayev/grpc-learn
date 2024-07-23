package az.example.org.grpcdemo.server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GrpcServer {

	private final Server server;

    public GrpcServer(Server server) {
        this.server = server;
    }

    public static GrpcServer create(BindableService... services) {
        return create(9090,services);
    }

	public static GrpcServer create(int port, BindableService... services) {
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(port);
		serverBuilder.addService(ProtoReflectionService.newInstance());
        Arrays.stream(services).forEach(serverBuilder::addService);
        return new GrpcServer(serverBuilder.build());
    }

    public void start() {
        List<String> services = server.getServices()
                .stream()
                .map(ServerServiceDefinition::getServiceDescriptor)
                .map(ServiceDescriptor::getName)
                .collect(Collectors.toList());

        try {
            server.start();
            System.out.println("Server start on port " + server.getPort() + " services: " + services);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void await(){
        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void stop() {
        server.shutdown();
    }




}
