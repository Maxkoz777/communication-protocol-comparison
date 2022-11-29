package com.example.grpc;

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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: GreetingService.proto")
public final class GreetingServiceGrpc {

  private GreetingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.GreetingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.HelloRequest,
      com.example.grpc.GreetingServiceOuterClass.HelloResponse> getGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting",
      requestType = com.example.grpc.GreetingServiceOuterClass.HelloRequest.class,
      responseType = com.example.grpc.GreetingServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.HelloRequest,
      com.example.grpc.GreetingServiceOuterClass.HelloResponse> getGreetingMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.HelloRequest, com.example.grpc.GreetingServiceOuterClass.HelloResponse> getGreetingMethod;
    if ((getGreetingMethod = GreetingServiceGrpc.getGreetingMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetingMethod = GreetingServiceGrpc.getGreetingMethod) == null) {
          GreetingServiceGrpc.getGreetingMethod = getGreetingMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.HelloRequest, com.example.grpc.GreetingServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreetingServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreetingServiceOuterClass.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greeting"))
              .build();
        }
      }
    }
    return getGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.HelloRequest,
      com.example.grpc.GreetingServiceOuterClass.HelloResponse> getLongComputationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "longComputation",
      requestType = com.example.grpc.GreetingServiceOuterClass.HelloRequest.class,
      responseType = com.example.grpc.GreetingServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.HelloRequest,
      com.example.grpc.GreetingServiceOuterClass.HelloResponse> getLongComputationMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.HelloRequest, com.example.grpc.GreetingServiceOuterClass.HelloResponse> getLongComputationMethod;
    if ((getLongComputationMethod = GreetingServiceGrpc.getLongComputationMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getLongComputationMethod = GreetingServiceGrpc.getLongComputationMethod) == null) {
          GreetingServiceGrpc.getLongComputationMethod = getLongComputationMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.HelloRequest, com.example.grpc.GreetingServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "longComputation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreetingServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreetingServiceOuterClass.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("longComputation"))
              .build();
        }
      }
    }
    return getLongComputationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.EnormousDTO,
      com.example.grpc.GreetingServiceOuterClass.EnormousDTO> getHeavyPayloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heavyPayload",
      requestType = com.example.grpc.GreetingServiceOuterClass.EnormousDTO.class,
      responseType = com.example.grpc.GreetingServiceOuterClass.EnormousDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.EnormousDTO,
      com.example.grpc.GreetingServiceOuterClass.EnormousDTO> getHeavyPayloadMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.EnormousDTO, com.example.grpc.GreetingServiceOuterClass.EnormousDTO> getHeavyPayloadMethod;
    if ((getHeavyPayloadMethod = GreetingServiceGrpc.getHeavyPayloadMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getHeavyPayloadMethod = GreetingServiceGrpc.getHeavyPayloadMethod) == null) {
          GreetingServiceGrpc.getHeavyPayloadMethod = getHeavyPayloadMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.EnormousDTO, com.example.grpc.GreetingServiceOuterClass.EnormousDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "heavyPayload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreetingServiceOuterClass.EnormousDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreetingServiceOuterClass.EnormousDTO.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("heavyPayload"))
              .build();
        }
      }
    }
    return getHeavyPayloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.EnormousDTO,
      com.example.grpc.GreetingServiceOuterClass.EnormousDTO> getHeavyPayloadListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heavyPayloadList",
      requestType = com.example.grpc.GreetingServiceOuterClass.EnormousDTO.class,
      responseType = com.example.grpc.GreetingServiceOuterClass.EnormousDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.EnormousDTO,
      com.example.grpc.GreetingServiceOuterClass.EnormousDTO> getHeavyPayloadListMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.EnormousDTO, com.example.grpc.GreetingServiceOuterClass.EnormousDTO> getHeavyPayloadListMethod;
    if ((getHeavyPayloadListMethod = GreetingServiceGrpc.getHeavyPayloadListMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getHeavyPayloadListMethod = GreetingServiceGrpc.getHeavyPayloadListMethod) == null) {
          GreetingServiceGrpc.getHeavyPayloadListMethod = getHeavyPayloadListMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.EnormousDTO, com.example.grpc.GreetingServiceOuterClass.EnormousDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "heavyPayloadList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreetingServiceOuterClass.EnormousDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreetingServiceOuterClass.EnormousDTO.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("heavyPayloadList"))
              .build();
        }
      }
    }
    return getHeavyPayloadListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingServiceStub newStub(io.grpc.Channel channel) {
    return new GreetingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greeting(com.example.grpc.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetingMethod(), responseObserver);
    }

    /**
     */
    public void longComputation(com.example.grpc.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLongComputationMethod(), responseObserver);
    }

    /**
     */
    public void heavyPayload(com.example.grpc.GreetingServiceOuterClass.EnormousDTO request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.EnormousDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getHeavyPayloadMethod(), responseObserver);
    }

    /**
     */
    public void heavyPayloadList(com.example.grpc.GreetingServiceOuterClass.EnormousDTO request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.EnormousDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getHeavyPayloadListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.HelloRequest,
                com.example.grpc.GreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_GREETING)))
          .addMethod(
            getLongComputationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.HelloRequest,
                com.example.grpc.GreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_LONG_COMPUTATION)))
          .addMethod(
            getHeavyPayloadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.EnormousDTO,
                com.example.grpc.GreetingServiceOuterClass.EnormousDTO>(
                  this, METHODID_HEAVY_PAYLOAD)))
          .addMethod(
            getHeavyPayloadListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.EnormousDTO,
                com.example.grpc.GreetingServiceOuterClass.EnormousDTO>(
                  this, METHODID_HEAVY_PAYLOAD_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class GreetingServiceStub extends io.grpc.stub.AbstractStub<GreetingServiceStub> {
    private GreetingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceStub(channel, callOptions);
    }

    /**
     */
    public void greeting(com.example.grpc.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void longComputation(com.example.grpc.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongComputationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heavyPayload(com.example.grpc.GreetingServiceOuterClass.EnormousDTO request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.EnormousDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeavyPayloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heavyPayloadList(com.example.grpc.GreetingServiceOuterClass.EnormousDTO request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.EnormousDTO> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getHeavyPayloadListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetingServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetingServiceBlockingStub> {
    private GreetingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.GreetingServiceOuterClass.HelloResponse greeting(com.example.grpc.GreetingServiceOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.GreetingServiceOuterClass.HelloResponse longComputation(com.example.grpc.GreetingServiceOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getLongComputationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.GreetingServiceOuterClass.EnormousDTO heavyPayload(com.example.grpc.GreetingServiceOuterClass.EnormousDTO request) {
      return blockingUnaryCall(
          getChannel(), getHeavyPayloadMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.GreetingServiceOuterClass.EnormousDTO> heavyPayloadList(
        com.example.grpc.GreetingServiceOuterClass.EnormousDTO request) {
      return blockingServerStreamingCall(
          getChannel(), getHeavyPayloadListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetingServiceFutureStub extends io.grpc.stub.AbstractStub<GreetingServiceFutureStub> {
    private GreetingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreetingServiceOuterClass.HelloResponse> greeting(
        com.example.grpc.GreetingServiceOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreetingServiceOuterClass.HelloResponse> longComputation(
        com.example.grpc.GreetingServiceOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLongComputationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreetingServiceOuterClass.EnormousDTO> heavyPayload(
        com.example.grpc.GreetingServiceOuterClass.EnormousDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getHeavyPayloadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;
  private static final int METHODID_LONG_COMPUTATION = 1;
  private static final int METHODID_HEAVY_PAYLOAD = 2;
  private static final int METHODID_HEAVY_PAYLOAD_LIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.example.grpc.GreetingServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse>) responseObserver);
          break;
        case METHODID_LONG_COMPUTATION:
          serviceImpl.longComputation((com.example.grpc.GreetingServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse>) responseObserver);
          break;
        case METHODID_HEAVY_PAYLOAD:
          serviceImpl.heavyPayload((com.example.grpc.GreetingServiceOuterClass.EnormousDTO) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.EnormousDTO>) responseObserver);
          break;
        case METHODID_HEAVY_PAYLOAD_LIST:
          serviceImpl.heavyPayloadList((com.example.grpc.GreetingServiceOuterClass.EnormousDTO) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.EnormousDTO>) responseObserver);
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

  private static abstract class GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.GreetingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService");
    }
  }

  private static final class GreetingServiceFileDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier {
    GreetingServiceFileDescriptorSupplier() {}
  }

  private static final class GreetingServiceMethodDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingServiceFileDescriptorSupplier())
              .addMethod(getGreetingMethod())
              .addMethod(getLongComputationMethod())
              .addMethod(getHeavyPayloadMethod())
              .addMethod(getHeavyPayloadListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
