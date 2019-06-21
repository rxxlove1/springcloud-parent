package com.xx.api.hello.client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("yyzt/hello/hello")
public interface HelloApi {

    @GetMapping("/helloWorld/{name}")
    String helloWorld(@PathVariable String name);
}
