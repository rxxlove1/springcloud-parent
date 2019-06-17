/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloService
 * Author:   xingxing ruan
 * Date:     2019/6/16 0016 18:21
 * Description: helloservice
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xx.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br> 
 * 〈helloservice〉
 *
 * @author xingxing ruan
 * @create 2019/6/16 0016
 * @since 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){

        return restTemplate.getForObject("http://SERVICE-EUREKA1/hi?name=" + name,String.class);
    }

    public String hiError(String name){
        return "hi," + name + " sorry error" ;
    }

}
