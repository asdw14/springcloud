package com.dizhongdi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * ClassName:Dept
 * Package:com.dizhongdi.pojo
 * Description:
 *
 * @Date: 2021/8/17 16:21
 * @Author:dizhongdi
 */
@Data
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable {
    public Long deptno;
    public String dname;
    public String db_source;

    public Dept() {
    }

    public Dept(Long deptno, String dname, String db_source) {
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
    }

    public Dept(String dname) {
        this.dname = dname;
    }
}
