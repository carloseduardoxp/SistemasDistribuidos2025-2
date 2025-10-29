package br.edu.iftm.tspi.sd;

import io.grpc.stub.StreamObserver;

public class ClienteServiceImpl extends ClienteServiceGrpc.ClienteServiceImplBase {

  @Override
  public void buscarClientePorId(ClienteServiceOuterClass.ClienteRequest request,
                                 StreamObserver<ClienteServiceOuterClass.ClienteResponse> responseObserver) {
      final ClienteServiceOuterClass.Cliente cliente = ClienteServiceOuterClass.Cliente.newBuilder()
          .setId(request.getId())
          .setNome("Carlos Eduardo " + request.getId())
          .build();

      responseObserver.onNext(
          ClienteServiceOuterClass.ClienteResponse.newBuilder().setCliente(cliente).build()
      );
      responseObserver.onCompleted();
  }
}
