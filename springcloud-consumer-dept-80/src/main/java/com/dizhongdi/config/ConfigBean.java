package com.dizhongdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:ConfigBean
 * Package:com.dizhongdi.config
 * Description:
 *
 * @Date: 2021/8/17 17:55
 * @Author:dizhongdi
 */
@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
