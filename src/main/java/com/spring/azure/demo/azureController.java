package com.spring.azure.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class azureController {
    @GetMapping("/message")
    public String test(){
        return "App deployed";
    }
}
