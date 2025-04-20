package com.asr.example.grpc.demo.service;

import com.asr.example.grpc.demo.proto.HelloWorldRequest;
import com.asr.example.grpc.demo.proto.HelloWorldResponse;
import com.asr.example.grpc.demo.proto.HelloWorldServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.grpc.server.service.GrpcService;
import org.springframework.util.StringUtils;

@GrpcService
public class HelloWorldService extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    private final Logger log = LoggerFactory.getLogger(HelloWorldService.class);

    @Override
    public void sayHello(HelloWorldRequest request, StreamObserver<HelloWorldResponse> responseObserver) {
        String name = request.getName();
        log.info("Message received from {}", name);
        String greeting = "Hello %s !!!".formatted(StringUtils.hasText(name) ? name : "World");
        responseObserver.onNext(HelloWorldResponse.newBuilder()
                .setGreeting(greeting)
                .build());
        responseObserver
                .onCompleted();
    }
}
