package com.example.ingram.demo.dao;

import com.example.ingram.demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> findAll();
    Student findById(int theId);
    Student saveOrUpdate(Student student);
    String deleteById(int studentId);
}
