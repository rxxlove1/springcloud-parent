package com.xx.servergateway.customgatewayfilter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;

public class RequestTimeGatewayFilterFactory extends AbstractGatewayFilterFactory<RequestTimeGatewayFilterFactory.Config> {
    private static final Log log = LogFactory.getLog(GatewayFilter.class);
    private static final String REQUEST_TIME_BEGIN = "request_time_begin";
    private static final String KEY = "withParams";

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList(KEY);
    }
    public RequestTimeGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config){
        return (exchange, chain) -> {
            exchange.getAttributes().put(REQUEST_TIME_BEGIN,System.currentTimeMillis());
            return chain.filter(exchange).then(
                    Mono.fromRunnable(() -> {
                        Long startTime = exchange.getAttribute(REQUEST_TIME_BEGIN);
                        if(startTime != null){
                            StringBuilder sb = new StringBuilder(exchange.getRequest().getURI().getRawPath())
                                    .append(":")
                                    .append(System.currentTimeMillis() - startTime)
                                    .append("ms");

                            System.out.println(config.isWithParams());
                            if(config.isWithParams()){
                                sb.append("params").append(exchange.getRequest().getQueryParams());
                            }
                            log.info(sb.toString());
                        }
                    })
                    );
        };
    }

    public static  class Config {
        private boolean withParams;

        public boolean isWithParams(){
            return withParams;
        }
        public void setWithParams(boolean withParams){
            this .withParams = withParams;
        }
    }
}
