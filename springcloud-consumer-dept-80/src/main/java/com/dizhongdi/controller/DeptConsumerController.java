package com.dizhongdi.controller;

import com.dizhongdi.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ClassName:DeptConsumerController
 * Package:com.dizhongdi.controller
 * Description:
 *
 * @Date: 2021/8/17 17:54
 * @Author:dizhongdi
 */
@RestController
public class DeptConsumerController {
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    //Ribbon:我们这里的地址，应该是一个变量，通过服务名来访问
    private static final String REST_URL_PREFIX = "http://springcloud-provider-dept";
    @Autowired
    RestTemplate template;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return template.getForObject(REST_URL_PREFIX+"/dept/get/"+ id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll() {
        List<Dept> depts = template.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
        return depts;
    }

    @RequestMapping("/consumer/dept/add")
    public Boolean addDept(String dname) {
        return template.postForObject(REST_URL_PREFIX+"/dept/add",dname,Boolean.class);

    }
}
