package com.example.ingram.demo.service;

import com.example.ingram.demo.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int theId);
    Student saveOrUpdate(Student student);
    String deleteById(int studentId);
}
