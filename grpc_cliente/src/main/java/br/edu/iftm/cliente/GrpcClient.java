package br.edu.iftm.cliente;

import br.edu.iftm.tspi.sd.ClienteServiceGrpc;
import br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest;
import br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext()
            .build();

        ClienteServiceGrpc.ClienteServiceBlockingStub clientStub = ClienteServiceGrpc.newBlockingStub(channel);

        ClienteRequest clienteRequest = ClienteRequest.newBuilder().setId(1).build();
        ClienteResponse clienteResponse = clientStub.buscarClientePorId(clienteRequest);
        System.out.println("Cliente encontrado: "+clienteResponse.getCliente().getNome());

        
        
    }
}