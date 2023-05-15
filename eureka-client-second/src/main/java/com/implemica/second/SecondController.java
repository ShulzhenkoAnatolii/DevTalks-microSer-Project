package com.implemica.second;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/second")
public class SecondController {

    @Value("${eureka.instance.instance-id}")
    private String serviceName;

    @Value("${app.service.icon}")
    private int iconCode;

    @GetMapping
    public String getGreeting() {
        final String greeting = new StringBuilder(new String(Character.toChars(iconCode)))
                .append(" ")
                .append("Hello from ")
                .append(serviceName)
                .toString();
        return greeting;
    }
}
