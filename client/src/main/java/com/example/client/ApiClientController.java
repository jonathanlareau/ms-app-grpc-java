package com.example.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pb.SayHelloServiceGrpc;
import pb.Services;
import pb.Services.SayHelloResponse;

@RestController
public class ApiClientController {

  @GetMapping("/api/sayhello/{msg}")
  public String retrieveExchangeMsgProto(@PathVariable final String msg) {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("sayhello-service", 3000).usePlaintext().build();

    SayHelloServiceGrpc.SayHelloServiceBlockingStub stub = SayHelloServiceGrpc.newBlockingStub(channel);

    SayHelloResponse sayHelloResponse = stub.compute(Services.SayHiRequest.newBuilder().setRequestMsg(msg).build());

    String response = sayHelloResponse.getResponseMsg();

    channel.shutdown();

    return response;
  }
}