package com.xx.hello.web;


import com.xx.api.hello.client.HelloApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {
    @Override
    public String helloWorld(String name) {
        return "hello world " + name;
    }
}
