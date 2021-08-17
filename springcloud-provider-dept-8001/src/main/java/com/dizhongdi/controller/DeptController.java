package com.dizhongdi.controller;

import com.dizhongdi.pojo.Dept;
import com.dizhongdi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.queryById(id);
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
