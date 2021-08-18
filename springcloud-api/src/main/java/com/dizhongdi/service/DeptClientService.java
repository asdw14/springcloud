package com.dizhongdi.service;

import com.dizhongdi.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * ClassName:DeptClientService
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/17 23:10
 * @Author:dizhongdi
 */

@Component
@FeignClient(value = "springcloud-provider-dept",fallbackFactory = DeptClientServiceFallBackFactory.class)
//fallbackFactory指定降级配置类
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    public List<Dept> queryAll();

    @GetMapping("/dept/add")
    public Boolean addDept(Dept dept);
}
