package com.gshepur.springbootprofiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("message")
@RestController
public class GreetingRestController {

    @Value("${message.hello}")
    private String message;

    @GetMapping("hello")
    public String getMessage(){
        return message;
    }
}
