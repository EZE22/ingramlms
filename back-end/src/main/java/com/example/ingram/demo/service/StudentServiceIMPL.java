package com.example.ingram.demo.service;

import com.example.ingram.demo.dao.StudentDAO;
import com.example.ingram.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {

    private final StudentDAO studentDAO;

    @Autowired
    public StudentServiceIMPL(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    @Transactional
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    @Transactional
    public Student findById(int theId) {
        return studentDAO.findById(theId);
    }

    @Override
    @Transactional
    public Student saveOrUpdate(Student student) {
        return studentDAO.saveOrUpdate(student);
    }

    @Override
    @Transactional
    public String deleteById(int studentId) {
        return studentDAO.deleteById(studentId);
    }
}
