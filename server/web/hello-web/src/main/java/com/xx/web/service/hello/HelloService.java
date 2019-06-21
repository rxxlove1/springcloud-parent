package com.xx.web.service.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import com.xx.api.hello.client.HelloApi;

@Component
@FeignClient(value = "hello-server")
public interface HelloService extends HelloApi {
}
