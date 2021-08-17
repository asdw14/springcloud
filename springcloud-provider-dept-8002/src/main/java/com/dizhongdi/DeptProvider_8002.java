package com.dizhongdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
public class DeptProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8002.class,args);
    }
}
