package com.xx.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Company:浙江核新同花顺网络信息股份有限公司
 * @Description:
 * @Author: zhanghao2@myhexin.com
 * @Date: 2019-03-14 10:54
 * @Version: 2.1.0
 */
@SpringBootApplication
@EnableFeignClients
public class HelloWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWebApplication.class, args);
    }

}
