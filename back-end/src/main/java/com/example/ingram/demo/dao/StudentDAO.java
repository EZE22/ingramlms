package com.example.ingram.demo.dao;

import com.example.ingram.demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> findAll();
    Object findById(int theId);
    Object saveOrUpdate(Student theEmployee);
    String deleteById(int theId);
}
