package com.dizhongdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * ClassName:DeptProvider_8001
 * Package:com.dizhongdi
 * Description:
 *
 * @Date: 2021/8/17 17:07
 * @Author:dizhongdi
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard_9001.class,args);
    }
}
