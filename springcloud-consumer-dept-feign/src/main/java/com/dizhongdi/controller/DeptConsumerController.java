package com.dizhongdi.controller;

import com.dizhongdi.pojo.Dept;
import com.dizhongdi.service.DeptClientService;
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
    @Autowired
    private DeptClientService deptClientService;
    /**
     * 消费方添加部门信息
     * @param dept
     * @return
     */
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return deptClientService.addDept(dept);
    }
    /**
     * 消费方根据id查询部门信息
     * @param id
     * @return
     */
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.queryById(id);
    }
    /**
     * 消费方查询部门信息列表
     * @return
     */
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.queryAll();
    }
}
