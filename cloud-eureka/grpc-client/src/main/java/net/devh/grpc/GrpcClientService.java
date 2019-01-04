package net.devh.grpc;


import org.springframework.stereotype.Service;

import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/11/8
 */
@Service
public class GrpcClientService {

    @GrpcClient("cloud-grpc-server")
    private GreeterGrpc.GreeterBlockingStub stub;

    public String sendMessage(String name) {
        HelloReply response = stub.sayHello(HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}
