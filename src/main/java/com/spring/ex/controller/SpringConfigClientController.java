package com.spring.ex.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@EnableAutoConfiguration
public class SpringConfigClientController {

	@Value("${envwish}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return this.message;
    }
}
