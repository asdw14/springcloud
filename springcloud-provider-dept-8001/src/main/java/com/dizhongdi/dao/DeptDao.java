package com.dizhongdi.dao;

import com.dizhongdi.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName:DeptDao
 * Package:com.dizhongdi.dao
 * Description:
 *
 * @Date: 2021/8/17 16:53
 * @Author:dizhongdi
 */
@Mapper
@Repository
public interface DeptDao {
    Dept queryById(Long deptno);
    List<Dept> queryAll();
    boolean addDept(Dept dept);
}
