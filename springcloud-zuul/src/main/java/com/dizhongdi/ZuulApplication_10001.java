package com.dizhongdi;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * ClassName:ZuulApplication_10001
 * Package:com.dizhongdi
 * Description:
 *
 * @Date: 2021/8/18 16:58
 * @Author:dizhongdi
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy    // 开启Zuul
public class ZuulApplication_10001{
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_10001.class,args);
    }

}
