package com.dizhongdi.service;

import com.dizhongdi.pojo.Dept;

import java.util.List;

/**
 * ClassName:DeptService
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/17 17:01
 * @Author:dizhongdi
 */
public interface DeptService {
    Dept queryById(Long deptno);
    List<Dept> queryAll();
    Boolean addDept(Dept dept);
}
