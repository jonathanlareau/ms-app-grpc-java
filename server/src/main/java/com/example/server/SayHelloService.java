package com.example.server;

import io.grpc.stub.StreamObserver;
import pb.SayHelloServiceGrpc.SayHelloServiceImplBase;
import pb.Services.SayHelloResponse;
import pb.Services.SayHiRequest;

public class SayHelloService extends SayHelloServiceImplBase {

    private int count = 0;

    @Override
    public void compute(final SayHiRequest request, final StreamObserver<SayHelloResponse> responseObserver) {

        final String str = "Hello from java";

        count++;

        final String msg = "{\"Msg\":\"" + request.getRequestMsg() + " <-> " + str + " -> " + count + " \"}";

        final SayHelloResponse response = SayHelloResponse.newBuilder().setResponseMsg(msg).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}