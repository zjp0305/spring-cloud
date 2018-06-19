package com.zuul;

import com.zuul.filter.ZuulAccessFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
  }

  @Bean
  public ZuulAccessFilter accessFilter() {
    return new ZuulAccessFilter();
  }
}
