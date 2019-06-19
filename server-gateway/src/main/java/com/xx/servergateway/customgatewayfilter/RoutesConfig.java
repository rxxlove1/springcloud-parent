package com.xx.servergateway.customgatewayfilter;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutesConfig {

    //@Bean
    //public RouteLocator myRoutes(RouteLocatorBuilder builder){
    //    String httpUri = "http://httpbin.org:80";
    //    return builder.routes()
    //            .route(p -> p
    //                    .path("/get")
    //                    .filters(f -> f.addRequestHeader("Hello", "World"))
    //                    .uri(httpUri))
    //            .route(p -> p
    //                    .host("*.hystrix.com")
    //                    .filters(f -> f
    //                            .hystrix(config -> config
    //                                    .setName("mycmd")
    //                                    .setFallbackUri("forward:/fallback")))
    //                    .uri(httpUri))
    //            .route(r -> r.path("/customer/**")
    //                    .filters(f -> f.filter(new RequestTimeFilter())
    //                            )
    //                    .uri("http://httpbin.org:80")
    //                    )
    //            .build();
    //}
    //
    //
    //@RequestMapping("/fallback")
    //public Mono<String> fallback() {
    //    return Mono.just("fallback");
    //}
    @Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory(){
        return  new RequestTimeGatewayFilterFactory();
    }

    @Bean
    public TokenGlobalFilter tokenGlobalFilter(){
        return  new TokenGlobalFilter();
    }
}
