package com.example.ingram.demo.dao;

import com.example.ingram.demo.entity.StudentProgress;

import java.util.List;

public interface StudentProgressDAO {
    List<StudentProgress> findAll();
    StudentProgress findById(int progressId);
    StudentProgress saveOrUpdate(StudentProgress progress);
}
