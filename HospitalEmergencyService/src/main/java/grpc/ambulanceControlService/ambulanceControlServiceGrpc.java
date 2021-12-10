package grpc.ambulanceControlService;

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
 * <pre>
 *Server Streaming RPCs where the client sends a request to the server and gets a stream to read a
 *sequence of messages back. The client reads from the returned stream until there is no more
 *messages.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ambulanceControlService.proto")
public final class ambulanceControlServiceGrpc {

  private ambulanceControlServiceGrpc() {}

  public static final String SERVICE_NAME = "AmbulanceControlService.ambulanceControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ambulanceControlService.AmbulanceRequest,
      grpc.ambulanceControlService.AmbulanceResponse> getEmergencyAmbulanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emergencyAmbulance",
      requestType = grpc.ambulanceControlService.AmbulanceRequest.class,
      responseType = grpc.ambulanceControlService.AmbulanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ambulanceControlService.AmbulanceRequest,
      grpc.ambulanceControlService.AmbulanceResponse> getEmergencyAmbulanceMethod() {
    io.grpc.MethodDescriptor<grpc.ambulanceControlService.AmbulanceRequest, grpc.ambulanceControlService.AmbulanceResponse> getEmergencyAmbulanceMethod;
    if ((getEmergencyAmbulanceMethod = ambulanceControlServiceGrpc.getEmergencyAmbulanceMethod) == null) {
      synchronized (ambulanceControlServiceGrpc.class) {
        if ((getEmergencyAmbulanceMethod = ambulanceControlServiceGrpc.getEmergencyAmbulanceMethod) == null) {
          ambulanceControlServiceGrpc.getEmergencyAmbulanceMethod = getEmergencyAmbulanceMethod = 
              io.grpc.MethodDescriptor.<grpc.ambulanceControlService.AmbulanceRequest, grpc.ambulanceControlService.AmbulanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AmbulanceControlService.ambulanceControlService", "emergencyAmbulance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ambulanceControlService.AmbulanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ambulanceControlService.AmbulanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ambulanceControlServiceMethodDescriptorSupplier("emergencyAmbulance"))
                  .build();
          }
        }
     }
     return getEmergencyAmbulanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ambulanceControlService.sendRequest,
      grpc.ambulanceControlService.SendResponse> getAmbulanceStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ambulanceStatus",
      requestType = grpc.ambulanceControlService.sendRequest.class,
      responseType = grpc.ambulanceControlService.SendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ambulanceControlService.sendRequest,
      grpc.ambulanceControlService.SendResponse> getAmbulanceStatusMethod() {
    io.grpc.MethodDescriptor<grpc.ambulanceControlService.sendRequest, grpc.ambulanceControlService.SendResponse> getAmbulanceStatusMethod;
    if ((getAmbulanceStatusMethod = ambulanceControlServiceGrpc.getAmbulanceStatusMethod) == null) {
      synchronized (ambulanceControlServiceGrpc.class) {
        if ((getAmbulanceStatusMethod = ambulanceControlServiceGrpc.getAmbulanceStatusMethod) == null) {
          ambulanceControlServiceGrpc.getAmbulanceStatusMethod = getAmbulanceStatusMethod = 
              io.grpc.MethodDescriptor.<grpc.ambulanceControlService.sendRequest, grpc.ambulanceControlService.SendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AmbulanceControlService.ambulanceControlService", "ambulanceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ambulanceControlService.sendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ambulanceControlService.SendResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ambulanceControlServiceMethodDescriptorSupplier("ambulanceStatus"))
                  .build();
          }
        }
     }
     return getAmbulanceStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ambulanceControlServiceStub newStub(io.grpc.Channel channel) {
    return new ambulanceControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ambulanceControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ambulanceControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ambulanceControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ambulanceControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Server Streaming RPCs where the client sends a request to the server and gets a stream to read a
   *sequence of messages back. The client reads from the returned stream until there is no more
   *messages.
   * </pre>
   */
  public static abstract class ambulanceControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void emergencyAmbulance(grpc.ambulanceControlService.AmbulanceRequest request,
        io.grpc.stub.StreamObserver<grpc.ambulanceControlService.AmbulanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyAmbulanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional Streaming RPCs where both sides send a sequence of messages using read-write
     *stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.ambulanceControlService.sendRequest> ambulanceStatus(
        io.grpc.stub.StreamObserver<grpc.ambulanceControlService.SendResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAmbulanceStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmergencyAmbulanceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.ambulanceControlService.AmbulanceRequest,
                grpc.ambulanceControlService.AmbulanceResponse>(
                  this, METHODID_EMERGENCY_AMBULANCE)))
          .addMethod(
            getAmbulanceStatusMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.ambulanceControlService.sendRequest,
                grpc.ambulanceControlService.SendResponse>(
                  this, METHODID_AMBULANCE_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   *Server Streaming RPCs where the client sends a request to the server and gets a stream to read a
   *sequence of messages back. The client reads from the returned stream until there is no more
   *messages.
   * </pre>
   */
  public static final class ambulanceControlServiceStub extends io.grpc.stub.AbstractStub<ambulanceControlServiceStub> {
    private ambulanceControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ambulanceControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ambulanceControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ambulanceControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void emergencyAmbulance(grpc.ambulanceControlService.AmbulanceRequest request,
        io.grpc.stub.StreamObserver<grpc.ambulanceControlService.AmbulanceResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEmergencyAmbulanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *bidirectional Streaming RPCs where both sides send a sequence of messages using read-write
     *stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.ambulanceControlService.sendRequest> ambulanceStatus(
        io.grpc.stub.StreamObserver<grpc.ambulanceControlService.SendResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAmbulanceStatusMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *Server Streaming RPCs where the client sends a request to the server and gets a stream to read a
   *sequence of messages back. The client reads from the returned stream until there is no more
   *messages.
   * </pre>
   */
  public static final class ambulanceControlServiceBlockingStub extends io.grpc.stub.AbstractStub<ambulanceControlServiceBlockingStub> {
    private ambulanceControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ambulanceControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ambulanceControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ambulanceControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<grpc.ambulanceControlService.AmbulanceResponse> emergencyAmbulance(
        grpc.ambulanceControlService.AmbulanceRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEmergencyAmbulanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Server Streaming RPCs where the client sends a request to the server and gets a stream to read a
   *sequence of messages back. The client reads from the returned stream until there is no more
   *messages.
   * </pre>
   */
  public static final class ambulanceControlServiceFutureStub extends io.grpc.stub.AbstractStub<ambulanceControlServiceFutureStub> {
    private ambulanceControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ambulanceControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ambulanceControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ambulanceControlServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EMERGENCY_AMBULANCE = 0;
  private static final int METHODID_AMBULANCE_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ambulanceControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ambulanceControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMERGENCY_AMBULANCE:
          serviceImpl.emergencyAmbulance((grpc.ambulanceControlService.AmbulanceRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ambulanceControlService.AmbulanceResponse>) responseObserver);
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
        case METHODID_AMBULANCE_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.ambulanceStatus(
              (io.grpc.stub.StreamObserver<grpc.ambulanceControlService.SendResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ambulanceControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ambulanceControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ambulanceControlService.ambulanceControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ambulanceControlService");
    }
  }

  private static final class ambulanceControlServiceFileDescriptorSupplier
      extends ambulanceControlServiceBaseDescriptorSupplier {
    ambulanceControlServiceFileDescriptorSupplier() {}
  }

  private static final class ambulanceControlServiceMethodDescriptorSupplier
      extends ambulanceControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ambulanceControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ambulanceControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ambulanceControlServiceFileDescriptorSupplier())
              .addMethod(getEmergencyAmbulanceMethod())
              .addMethod(getAmbulanceStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
