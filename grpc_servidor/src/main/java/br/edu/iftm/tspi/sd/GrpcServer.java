package br.edu.iftm.tspi.sd;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(50051)
                .addService(new ClienteServiceImpl())
                .build();

        System.out.println("Iniciando servidor gRPC...");
        server.start();
        System.out.println("Servidor iniciado na porta 50051");

        server.awaitTermination();
    }
}
