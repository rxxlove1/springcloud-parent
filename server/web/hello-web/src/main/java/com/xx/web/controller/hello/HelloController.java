package com.xx.web.controller.hello;

import com.xx.web.service.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello1/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/helloworld")
    @ResponseBody
    public Object helloWorld(@RequestParam("name") String name){
        return helloService.helloWorld(name);
    }
}
