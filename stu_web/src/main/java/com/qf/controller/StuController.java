package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Class1;
import com.qf.entity.Student;
import com.qf.service.IClassService;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private IStuService stuService;

    @Reference
    private IClassService classService;

    @RequestMapping("/list")
    public String list(ModelMap map){
        //远程调用服务的提供者
        List<Student> studentList = stuService.queryAll();
        map.put("studentList",studentList);
        return "stulist";
    }

    //跳转到添加学生页面
    @RequestMapping("/toAdd")
    public String toAdd(ModelMap map){
        List<Class1> classList = classService.queryAll();
        map.put("classList",classList);
        return "stuadd";
    }

    //添加学生
    @RequestMapping("/add")
    public String add(Student student){
        stuService.add(student);
        return "redirect:/";
    }

}
