package com.example.ingram.demo.service;

import com.example.ingram.demo.entity.StudentProgress;

import java.util.List;

public interface StudentProgressService {
    List<StudentProgress> findAll();
    StudentProgress findById(int progressId);
    StudentProgress saveOrUpdate(StudentProgress progress);
}
