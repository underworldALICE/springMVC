package com.underworld.service;

import com.underworld.domain.Student;

import java.util.List;

public interface StudentService {
    public int addStudent(Student student);
    public List<Student> findStudent();
}
