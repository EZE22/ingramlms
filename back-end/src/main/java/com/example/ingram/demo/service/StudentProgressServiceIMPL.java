package com.example.ingram.demo.service;

import com.example.ingram.demo.dao.StudentProgressDAO;
import com.example.ingram.demo.entity.StudentProgress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentProgressServiceIMPL implements StudentProgressService {

    private final StudentProgressDAO studentProgressDAO;

    @Autowired
    public StudentProgressServiceIMPL(StudentProgressDAO studentProgressDAO) {
        this.studentProgressDAO = studentProgressDAO;
    }

    @Override
    @Transactional
    public List<StudentProgress> findAll() {
        return studentProgressDAO.findAll();
    }

    @Override
    public StudentProgress findById(int progressId) {
        return studentProgressDAO.findById(progressId);
    }

    @Override
    @Transactional
    public StudentProgress saveOrUpdate(StudentProgress progress) {
        return studentProgressDAO.saveOrUpdate(progress);
    }
}
