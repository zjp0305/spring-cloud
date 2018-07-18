package com.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
    @Autowired
    private Environment env;
    
    @RequestMapping("/config/{key}")
    public String getConfig(@PathVariable(value = "key") String key){
        return env.getProperty(key,System.currentTimeMillis()+"");
    }
}
