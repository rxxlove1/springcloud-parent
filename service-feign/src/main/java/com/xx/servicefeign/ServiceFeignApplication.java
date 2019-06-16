package com.xx.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 〈一句话功能简述〉<br>
 * 〈feign〉
 *
 * @author xingxing ruan
 * @create 2019/6/16 0016
 * @since 1.0.0
 */
@SpringBootApplication
@EnableFeignClients
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }

}
