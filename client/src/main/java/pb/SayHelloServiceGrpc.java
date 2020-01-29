package pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: services.proto")
public final class SayHelloServiceGrpc {

  private SayHelloServiceGrpc() {}

  public static final String SERVICE_NAME = "pb.SayHelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pb.Services.SayHiRequest,
      pb.Services.SayHelloResponse> getComputeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compute",
      requestType = pb.Services.SayHiRequest.class,
      responseType = pb.Services.SayHelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pb.Services.SayHiRequest,
      pb.Services.SayHelloResponse> getComputeMethod() {
    io.grpc.MethodDescriptor<pb.Services.SayHiRequest, pb.Services.SayHelloResponse> getComputeMethod;
    if ((getComputeMethod = SayHelloServiceGrpc.getComputeMethod) == null) {
      synchronized (SayHelloServiceGrpc.class) {
        if ((getComputeMethod = SayHelloServiceGrpc.getComputeMethod) == null) {
          SayHelloServiceGrpc.getComputeMethod = getComputeMethod =
              io.grpc.MethodDescriptor.<pb.Services.SayHiRequest, pb.Services.SayHelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.Services.SayHiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.Services.SayHelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SayHelloServiceMethodDescriptorSupplier("Compute"))
              .build();
        }
      }
    }
    return getComputeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SayHelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayHelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayHelloServiceStub>() {
        @java.lang.Override
        public SayHelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayHelloServiceStub(channel, callOptions);
        }
      };
    return SayHelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SayHelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayHelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayHelloServiceBlockingStub>() {
        @java.lang.Override
        public SayHelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayHelloServiceBlockingStub(channel, callOptions);
        }
      };
    return SayHelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SayHelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayHelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayHelloServiceFutureStub>() {
        @java.lang.Override
        public SayHelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayHelloServiceFutureStub(channel, callOptions);
        }
      };
    return SayHelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SayHelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void compute(pb.Services.SayHiRequest request,
        io.grpc.stub.StreamObserver<pb.Services.SayHelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getComputeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getComputeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pb.Services.SayHiRequest,
                pb.Services.SayHelloResponse>(
                  this, METHODID_COMPUTE)))
          .build();
    }
  }

  /**
   */
  public static final class SayHelloServiceStub extends io.grpc.stub.AbstractAsyncStub<SayHelloServiceStub> {
    private SayHelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayHelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayHelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void compute(pb.Services.SayHiRequest request,
        io.grpc.stub.StreamObserver<pb.Services.SayHelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SayHelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SayHelloServiceBlockingStub> {
    private SayHelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayHelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayHelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pb.Services.SayHelloResponse compute(pb.Services.SayHiRequest request) {
      return blockingUnaryCall(
          getChannel(), getComputeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SayHelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SayHelloServiceFutureStub> {
    private SayHelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayHelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayHelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pb.Services.SayHelloResponse> compute(
        pb.Services.SayHiRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPUTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SayHelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SayHelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPUTE:
          serviceImpl.compute((pb.Services.SayHiRequest) request,
              (io.grpc.stub.StreamObserver<pb.Services.SayHelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SayHelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SayHelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pb.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SayHelloService");
    }
  }

  private static final class SayHelloServiceFileDescriptorSupplier
      extends SayHelloServiceBaseDescriptorSupplier {
    SayHelloServiceFileDescriptorSupplier() {}
  }

  private static final class SayHelloServiceMethodDescriptorSupplier
      extends SayHelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SayHelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SayHelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SayHelloServiceFileDescriptorSupplier())
              .addMethod(getComputeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
