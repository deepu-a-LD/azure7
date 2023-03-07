package com.spring.azure.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class azureController {
    @Autowired
    azureService serv;

    @GetMapping("/message")
    public void test(@RequestParam int num) throws IOException {
        serv.check(num);
        //return "App deployed";

    }
}
