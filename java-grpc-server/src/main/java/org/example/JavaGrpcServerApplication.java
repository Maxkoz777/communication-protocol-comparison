package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import org.example.service.GreetingServiceImpl;

/**
 * Hello world!
 */
public class JavaGrpcServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
            .addService(new GreetingServiceImpl())
            .build();
        server.start();
        System.out.println("Server successfully started!");
        server.awaitTermination();
    }
}
