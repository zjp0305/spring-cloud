package ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "serviceFail")
    public String service() {
        String url = "http://SERVICE/server/getServerTime";
        return restTemplate.getForEntity(url, String.class).getBody();
    }
    
    public String serviceFail() {
        return "fail";
    }
}
