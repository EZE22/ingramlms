package com.example.ingram.demo.dao;

import java.util.List;

public interface StudentDAO {
    List<Object> findAll();
    Object findById(int theId);
    void save(Object theEmployee);
    void deleteById(int theId);
}
