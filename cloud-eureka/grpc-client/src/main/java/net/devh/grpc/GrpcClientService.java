package net.devh.grpc;

import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;

import org.springframework.stereotype.Service;

import io.grpc.Channel;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;

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
