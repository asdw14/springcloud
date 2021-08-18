package com.dizhongdi.service;

import com.dizhongdi.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName:DeptClientServiceFallBackFactory
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/17 23:11
 * @Author:dizhongdi
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept(id,"没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭","没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}
