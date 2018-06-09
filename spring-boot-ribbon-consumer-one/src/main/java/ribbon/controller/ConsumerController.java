package ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
  @Autowired private RestTemplate restTemplate;

  @RequestMapping("/ribbon-consumer")
  public String ribbonConsumer() {
    String url = "http://SERVICE-01/server/getServerTime";
    return restTemplate.getForEntity(url, String.class).getBody();
  }
}
