package com.dizhongdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

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
@EnableFeignClients(basePackages = {"com.dizhongdi"})
public class DeptFeignConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptFeignConsumer_80.class,args);
    }
}
