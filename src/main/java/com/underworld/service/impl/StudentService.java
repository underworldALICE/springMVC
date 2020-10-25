package com.underworld.service.impl;

import com.underworld.dao.StudentDao;
import com.underworld.domain.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentService implements com.underworld.service.StudentService {
    //引用类型的自动注入
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.selectStudent();
    }
}
