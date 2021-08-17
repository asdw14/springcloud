package com.dizhongdi.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
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
    @LoadBalanced   //配置负载均衡实现RestTemplate
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
    }

}
