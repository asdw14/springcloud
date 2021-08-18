package com.dizhongdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * ClassName:DeptProvider_8001
 * Package:com.dizhongdi
 * Description:
 *
 * @Date: 2021/8/17 17:07
 * @Author:dizhongdi
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 服务发现~
@EnableCircuitBreaker // 添加对熔断的支持注解
public class DeptProviderHystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8001.class,args);
    }
}
