package sever.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
public class TimeController {
  @Autowired private DiscoveryClient client;

  @RequestMapping("getServerTime")
  public String getServerTime() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String serverTime = sdf.format(new Date());
    return serverTime;
  }
}
