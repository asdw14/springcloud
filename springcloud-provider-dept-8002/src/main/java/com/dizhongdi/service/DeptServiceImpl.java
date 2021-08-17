package com.dizhongdi.service;

import com.dizhongdi.dao.DeptDao;
import com.dizhongdi.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:DeptServiceImpl
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/17 17:01
 * @Author:dizhongdi
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptDao deptDao;

    @Override
    public Dept queryById(Long deptno) {
        Dept dept = deptDao.queryById(deptno);
        return dept;
    }

    @Override
    public List<Dept> queryAll() {
        List<Dept> depts = deptDao.queryAll();
        return depts;
    }

    @Override
    public Boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
}
