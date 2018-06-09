package sever;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ServerApplation {

  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication();
    springApplication.setBannerMode(Banner.Mode.OFF);
    springApplication.run(ServerApplation.class, args);
  }
}
