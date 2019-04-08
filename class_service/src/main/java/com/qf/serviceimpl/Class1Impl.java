package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.Class1Mapper;
import com.qf.entity.Class1;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class Class1Impl implements IClassService {

    @Autowired
    private Class1Mapper class1Mapper;

    @Override
    public List<Class1> queryAll() {
        return class1Mapper.selectList(null);
    }

/*    //添加班级总人数
    @Override
    public int addClassSum(int id) {
        Class1 class1 = class1Mapper.selectById(id);
        class1.set

        return 0;
    }*/
}
