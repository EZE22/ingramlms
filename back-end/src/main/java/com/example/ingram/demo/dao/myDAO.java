package com.example.ingram.demo.dao;

import com.example.ingram.demo.entity.Student;

import java.util.List;

public interface myDAO {
    List<Object> findAll();
    Object findById(int theId);
    Object saveOrUpdate(Object theEmployee);
    String deleteById(int theId);
}
