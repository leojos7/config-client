package com.spring.cloud.learn.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class FrontController {

    @Value("${my.greeting: default value}")
    private String greetingMessage;


    @GetMapping("/greeting")
    public String greeting() {
        return "my.greeting: "+greetingMessage+"";
    }
}
