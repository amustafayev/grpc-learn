package az.example.org.grpcclient.controller;

import az.example.org.grpcclient.client.grpc.SayHelloClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/grpc")
public class SayHelloStubController {

    private final SayHelloClient sayHelloClient;

    public SayHelloStubController(SayHelloClient sayHelloClient) {
        this.sayHelloClient = sayHelloClient;
    }

    @GetMapping
    public void sayHello() {
        System.out.println("Say Hello");
        sayHelloClient.callSayHelloServer();
    }

}
