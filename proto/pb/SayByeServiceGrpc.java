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
public final class SayByeServiceGrpc {

  private SayByeServiceGrpc() {}

  public static final String SERVICE_NAME = "pb.SayByeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pb.Services.SayHiRequest,
      pb.Services.SayByeResponse> getComputeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compute",
      requestType = pb.Services.SayHiRequest.class,
      responseType = pb.Services.SayByeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pb.Services.SayHiRequest,
      pb.Services.SayByeResponse> getComputeMethod() {
    io.grpc.MethodDescriptor<pb.Services.SayHiRequest, pb.Services.SayByeResponse> getComputeMethod;
    if ((getComputeMethod = SayByeServiceGrpc.getComputeMethod) == null) {
      synchronized (SayByeServiceGrpc.class) {
        if ((getComputeMethod = SayByeServiceGrpc.getComputeMethod) == null) {
          SayByeServiceGrpc.getComputeMethod = getComputeMethod =
              io.grpc.MethodDescriptor.<pb.Services.SayHiRequest, pb.Services.SayByeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.Services.SayHiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.Services.SayByeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SayByeServiceMethodDescriptorSupplier("Compute"))
              .build();
        }
      }
    }
    return getComputeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SayByeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayByeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayByeServiceStub>() {
        @java.lang.Override
        public SayByeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayByeServiceStub(channel, callOptions);
        }
      };
    return SayByeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SayByeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayByeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayByeServiceBlockingStub>() {
        @java.lang.Override
        public SayByeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayByeServiceBlockingStub(channel, callOptions);
        }
      };
    return SayByeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SayByeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayByeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayByeServiceFutureStub>() {
        @java.lang.Override
        public SayByeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayByeServiceFutureStub(channel, callOptions);
        }
      };
    return SayByeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SayByeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void compute(pb.Services.SayHiRequest request,
        io.grpc.stub.StreamObserver<pb.Services.SayByeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getComputeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getComputeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pb.Services.SayHiRequest,
                pb.Services.SayByeResponse>(
                  this, METHODID_COMPUTE)))
          .build();
    }
  }

  /**
   */
  public static final class SayByeServiceStub extends io.grpc.stub.AbstractAsyncStub<SayByeServiceStub> {
    private SayByeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayByeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayByeServiceStub(channel, callOptions);
    }

    /**
     */
    public void compute(pb.Services.SayHiRequest request,
        io.grpc.stub.StreamObserver<pb.Services.SayByeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SayByeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SayByeServiceBlockingStub> {
    private SayByeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayByeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayByeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pb.Services.SayByeResponse compute(pb.Services.SayHiRequest request) {
      return blockingUnaryCall(
          getChannel(), getComputeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SayByeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SayByeServiceFutureStub> {
    private SayByeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayByeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayByeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pb.Services.SayByeResponse> compute(
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
    private final SayByeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SayByeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPUTE:
          serviceImpl.compute((pb.Services.SayHiRequest) request,
              (io.grpc.stub.StreamObserver<pb.Services.SayByeResponse>) responseObserver);
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

  private static abstract class SayByeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SayByeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pb.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SayByeService");
    }
  }

  private static final class SayByeServiceFileDescriptorSupplier
      extends SayByeServiceBaseDescriptorSupplier {
    SayByeServiceFileDescriptorSupplier() {}
  }

  private static final class SayByeServiceMethodDescriptorSupplier
      extends SayByeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SayByeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SayByeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SayByeServiceFileDescriptorSupplier())
              .addMethod(getComputeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
