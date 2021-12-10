package grpc.registrationControlService;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: registrationControlService.proto")
public final class registrationControlServiceGrpc {

  private registrationControlServiceGrpc() {}

  public static final String SERVICE_NAME = "RegistrationControlService.registrationControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.registrationControlService.HospitalHelpRequest,
      grpc.registrationControlService.HospitalHelpResponce> getGetHospitalHelpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHospitalHelp",
      requestType = grpc.registrationControlService.HospitalHelpRequest.class,
      responseType = grpc.registrationControlService.HospitalHelpResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.registrationControlService.HospitalHelpRequest,
      grpc.registrationControlService.HospitalHelpResponce> getGetHospitalHelpMethod() {
    io.grpc.MethodDescriptor<grpc.registrationControlService.HospitalHelpRequest, grpc.registrationControlService.HospitalHelpResponce> getGetHospitalHelpMethod;
    if ((getGetHospitalHelpMethod = registrationControlServiceGrpc.getGetHospitalHelpMethod) == null) {
      synchronized (registrationControlServiceGrpc.class) {
        if ((getGetHospitalHelpMethod = registrationControlServiceGrpc.getGetHospitalHelpMethod) == null) {
          registrationControlServiceGrpc.getGetHospitalHelpMethod = getGetHospitalHelpMethod = 
              io.grpc.MethodDescriptor.<grpc.registrationControlService.HospitalHelpRequest, grpc.registrationControlService.HospitalHelpResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationControlService.registrationControlService", "GetHospitalHelp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.registrationControlService.HospitalHelpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.registrationControlService.HospitalHelpResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new registrationControlServiceMethodDescriptorSupplier("GetHospitalHelp"))
                  .build();
          }
        }
     }
     return getGetHospitalHelpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.registrationControlService.sendRegistrationRequest,
      grpc.registrationControlService.sendResgistrationResponce> getSendStringClientStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendStringClientStreaming",
      requestType = grpc.registrationControlService.sendRegistrationRequest.class,
      responseType = grpc.registrationControlService.sendResgistrationResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.registrationControlService.sendRegistrationRequest,
      grpc.registrationControlService.sendResgistrationResponce> getSendStringClientStreamingMethod() {
    io.grpc.MethodDescriptor<grpc.registrationControlService.sendRegistrationRequest, grpc.registrationControlService.sendResgistrationResponce> getSendStringClientStreamingMethod;
    if ((getSendStringClientStreamingMethod = registrationControlServiceGrpc.getSendStringClientStreamingMethod) == null) {
      synchronized (registrationControlServiceGrpc.class) {
        if ((getSendStringClientStreamingMethod = registrationControlServiceGrpc.getSendStringClientStreamingMethod) == null) {
          registrationControlServiceGrpc.getSendStringClientStreamingMethod = getSendStringClientStreamingMethod = 
              io.grpc.MethodDescriptor.<grpc.registrationControlService.sendRegistrationRequest, grpc.registrationControlService.sendResgistrationResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationControlService.registrationControlService", "SendStringClientStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.registrationControlService.sendRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.registrationControlService.sendResgistrationResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new registrationControlServiceMethodDescriptorSupplier("SendStringClientStreaming"))
                  .build();
          }
        }
     }
     return getSendStringClientStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static registrationControlServiceStub newStub(io.grpc.Channel channel) {
    return new registrationControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static registrationControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new registrationControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static registrationControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new registrationControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class registrationControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getHospitalHelp(grpc.registrationControlService.HospitalHelpRequest request,
        io.grpc.stub.StreamObserver<grpc.registrationControlService.HospitalHelpResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHospitalHelpMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.registrationControlService.sendRegistrationRequest> sendStringClientStreaming(
        io.grpc.stub.StreamObserver<grpc.registrationControlService.sendResgistrationResponce> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendStringClientStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHospitalHelpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.registrationControlService.HospitalHelpRequest,
                grpc.registrationControlService.HospitalHelpResponce>(
                  this, METHODID_GET_HOSPITAL_HELP)))
          .addMethod(
            getSendStringClientStreamingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.registrationControlService.sendRegistrationRequest,
                grpc.registrationControlService.sendResgistrationResponce>(
                  this, METHODID_SEND_STRING_CLIENT_STREAMING)))
          .build();
    }
  }

  /**
   */
  public static final class registrationControlServiceStub extends io.grpc.stub.AbstractStub<registrationControlServiceStub> {
    private registrationControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getHospitalHelp(grpc.registrationControlService.HospitalHelpRequest request,
        io.grpc.stub.StreamObserver<grpc.registrationControlService.HospitalHelpResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHospitalHelpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.registrationControlService.sendRegistrationRequest> sendStringClientStreaming(
        io.grpc.stub.StreamObserver<grpc.registrationControlService.sendResgistrationResponce> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendStringClientStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class registrationControlServiceBlockingStub extends io.grpc.stub.AbstractStub<registrationControlServiceBlockingStub> {
    private registrationControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public grpc.registrationControlService.HospitalHelpResponce getHospitalHelp(grpc.registrationControlService.HospitalHelpRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHospitalHelpMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class registrationControlServiceFutureStub extends io.grpc.stub.AbstractStub<registrationControlServiceFutureStub> {
    private registrationControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.registrationControlService.HospitalHelpResponce> getHospitalHelp(
        grpc.registrationControlService.HospitalHelpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHospitalHelpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOSPITAL_HELP = 0;
  private static final int METHODID_SEND_STRING_CLIENT_STREAMING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final registrationControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(registrationControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOSPITAL_HELP:
          serviceImpl.getHospitalHelp((grpc.registrationControlService.HospitalHelpRequest) request,
              (io.grpc.stub.StreamObserver<grpc.registrationControlService.HospitalHelpResponce>) responseObserver);
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
        case METHODID_SEND_STRING_CLIENT_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendStringClientStreaming(
              (io.grpc.stub.StreamObserver<grpc.registrationControlService.sendResgistrationResponce>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class registrationControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    registrationControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.registrationControlService.registrationControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("registrationControlService");
    }
  }

  private static final class registrationControlServiceFileDescriptorSupplier
      extends registrationControlServiceBaseDescriptorSupplier {
    registrationControlServiceFileDescriptorSupplier() {}
  }

  private static final class registrationControlServiceMethodDescriptorSupplier
      extends registrationControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    registrationControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (registrationControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new registrationControlServiceFileDescriptorSupplier())
              .addMethod(getGetHospitalHelpMethod())
              .addMethod(getSendStringClientStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
