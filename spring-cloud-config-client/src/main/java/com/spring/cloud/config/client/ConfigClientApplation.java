package com.spring.cloud.config.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplation {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplation.class).web(true).run(args);
    }
}
