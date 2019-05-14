package com.gshepur.springbootprofiles.controller;

import com.gshepur.springbootprofiles.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("message")
@RestController
public class GreetingRestController {

    @Value("${message.hello}")
    private String message;

    @Autowired
    private IService iService;

    @GetMapping("hello")
    public String getMessage(){
        return message;
    }

    @GetMapping("hello2")
    public String getMessage2(){
        return iService.getMessage();
    }

}
