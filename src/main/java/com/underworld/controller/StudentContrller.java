package com.underworld.controller;

import com.underworld.domain.Student;
import com.underworld.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/student")
public class StudentContrller {
    //自动注入
    @Resource
    private StudentService studentService;
    //注册学生
    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView modelAndView = new ModelAndView();
        //调用service处理student
        int nums = studentService.addStudent(student);
        String tips = "注册失败";
        if(nums > 0){
            //注册成功
            tips = "学生 【" + student.getName() + "】 注册成功";
        }
        //指定结果页面
        modelAndView.addObject("tips",tips);
        modelAndView.setViewName("result");
        return modelAndView;
    }

}
