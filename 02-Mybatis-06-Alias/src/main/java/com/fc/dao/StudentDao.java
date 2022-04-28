package com.fc.dao;

import com.fc.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    Student findById(Integer id);
    List<Student> findName(String name);
    List<Student> findAge(Byte age);
    List<Student> findGender(String gender);
}
