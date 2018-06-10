package ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ribbon.service.ConsumerService;

@RestController
public class ConsumerController {
    
    @Autowired
    private ConsumerService consumerService;
    
    @RequestMapping("/ribbon-consumer")
    public String ribbonConsumer() {
        return consumerService.service();
    }
}
