package com.underworld.dao;

import com.underworld.domain.Student;

import java.util.List;

public interface StudentDao {
    public int insertStudent(Student student);
    public List<Student> selectStudent();

}
