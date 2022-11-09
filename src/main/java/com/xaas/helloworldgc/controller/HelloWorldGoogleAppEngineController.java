package com.xaas.helloworldgc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldGoogleAppEngineController {

    @GetMapping
    public String helloWorld() {
        return "Hello World Google App Engine";
    }

}
