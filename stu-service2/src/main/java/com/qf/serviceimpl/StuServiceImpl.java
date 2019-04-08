package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import com.qf.service.IClassService;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//学生服务的实现类
@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;

    @Reference
    private IClassService classService;

    @Override
    public int add(Student student) {
        //添加学生
        stuMapper.insert(student);
        //添加班级总人数
      /*  classService.addClassSum(student.getClassId());*/
        return 1;
    }

    @Override
    public List<Student> queryAll() {
        System.out.println("学生服务2被调用");
        return stuMapper.selectList(null);
    }
}
