package net.devh.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/11/8
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudGrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGrpcClientApplication.class, args);
    }
}
