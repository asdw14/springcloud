package com.dizhongdi.controller;

import com.dizhongdi.pojo.Dept;
import com.dizhongdi.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:DeptController
 * Package:com.dizhongdi.controller
 * Description:
 *
 * @Date: 2021/8/17 17:03
 * @Author:dizhongdi
 */
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @RequestMapping("/dept/get/{id}")//根据id查询
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if (dept==null){
            throw new RuntimeException("这个id=>"+id+",不存在该用户，或信息无法找到~");
        }
        return dept;
    }
    /**
     * 根据id查询备选方案(熔断)
     * @param id
     * @return
     */
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept(id,"这个id=>没有对应的信息, null---@Hystrix ~","在MySQL中没有这个数据库");
    }


    @RequestMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    @RequestMapping("/dept/add")
    public Boolean addDept(String dname) {
        return deptService.addDept(new Dept(dname));

    }


}
