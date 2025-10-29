package br.edu.iftm.tspi.sd;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ClienteServiceGrpc {

  private ClienteServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "br.edu.iftm.tspi.sd.ClienteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest,
      br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse> getBuscarClientePorIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuscarClientePorId",
      requestType = br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest.class,
      responseType = br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest,
      br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse> getBuscarClientePorIdMethod() {
    io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest, br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse> getBuscarClientePorIdMethod;
    if ((getBuscarClientePorIdMethod = ClienteServiceGrpc.getBuscarClientePorIdMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getBuscarClientePorIdMethod = ClienteServiceGrpc.getBuscarClientePorIdMethod) == null) {
          ClienteServiceGrpc.getBuscarClientePorIdMethod = getBuscarClientePorIdMethod =
              io.grpc.MethodDescriptor.<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest, br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuscarClientePorId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("BuscarClientePorId"))
              .build();
        }
      }
    }
    return getBuscarClientePorIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest,
      br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse> getBuscarClientesPorNomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuscarClientesPorNome",
      requestType = br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest.class,
      responseType = br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest,
      br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse> getBuscarClientesPorNomeMethod() {
    io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest, br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse> getBuscarClientesPorNomeMethod;
    if ((getBuscarClientesPorNomeMethod = ClienteServiceGrpc.getBuscarClientesPorNomeMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getBuscarClientesPorNomeMethod = ClienteServiceGrpc.getBuscarClientesPorNomeMethod) == null) {
          ClienteServiceGrpc.getBuscarClientesPorNomeMethod = getBuscarClientesPorNomeMethod =
              io.grpc.MethodDescriptor.<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest, br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuscarClientesPorNome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("BuscarClientesPorNome"))
              .build();
        }
      }
    }
    return getBuscarClientesPorNomeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClienteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceStub>() {
        @java.lang.Override
        public ClienteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceStub(channel, callOptions);
        }
      };
    return ClienteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ClienteServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceBlockingV2Stub>() {
        @java.lang.Override
        public ClienteServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ClienteServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClienteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceBlockingStub>() {
        @java.lang.Override
        public ClienteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceBlockingStub(channel, callOptions);
        }
      };
    return ClienteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClienteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceFutureStub>() {
        @java.lang.Override
        public ClienteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceFutureStub(channel, callOptions);
        }
      };
    return ClienteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void buscarClientePorId(br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest request,
        io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuscarClientePorIdMethod(), responseObserver);
    }

    /**
     */
    default void buscarClientesPorNome(br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest request,
        io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuscarClientesPorNomeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClienteService.
   */
  public static abstract class ClienteServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClienteServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClienteService.
   */
  public static final class ClienteServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClienteServiceStub> {
    private ClienteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceStub(channel, callOptions);
    }

    /**
     */
    public void buscarClientePorId(br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest request,
        io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuscarClientePorIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buscarClientesPorNome(br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest request,
        io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuscarClientesPorNomeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClienteService.
   */
  public static final class ClienteServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ClienteServiceBlockingV2Stub> {
    private ClienteServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse buscarClientePorId(br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBuscarClientePorIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse buscarClientesPorNome(br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBuscarClientesPorNomeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ClienteService.
   */
  public static final class ClienteServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClienteServiceBlockingStub> {
    private ClienteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse buscarClientePorId(br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuscarClientePorIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse buscarClientesPorNome(br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuscarClientesPorNomeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClienteService.
   */
  public static final class ClienteServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClienteServiceFutureStub> {
    private ClienteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse> buscarClientePorId(
        br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuscarClientePorIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse> buscarClientesPorNome(
        br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuscarClientesPorNomeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BUSCAR_CLIENTE_POR_ID = 0;
  private static final int METHODID_BUSCAR_CLIENTES_POR_NOME = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUSCAR_CLIENTE_POR_ID:
          serviceImpl.buscarClientePorId((br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest) request,
              (io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse>) responseObserver);
          break;
        case METHODID_BUSCAR_CLIENTES_POR_NOME:
          serviceImpl.buscarClientesPorNome((br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest) request,
              (io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getBuscarClientePorIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest,
              br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse>(
                service, METHODID_BUSCAR_CLIENTE_POR_ID)))
        .addMethod(
          getBuscarClientesPorNomeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest,
              br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse>(
                service, METHODID_BUSCAR_CLIENTES_POR_NOME)))
        .build();
  }

  private static abstract class ClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClienteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.edu.iftm.tspi.sd.ClienteServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClienteService");
    }
  }

  private static final class ClienteServiceFileDescriptorSupplier
      extends ClienteServiceBaseDescriptorSupplier {
    ClienteServiceFileDescriptorSupplier() {}
  }

  private static final class ClienteServiceMethodDescriptorSupplier
      extends ClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClienteServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClienteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClienteServiceFileDescriptorSupplier())
              .addMethod(getBuscarClientePorIdMethod())
              .addMethod(getBuscarClientesPorNomeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
