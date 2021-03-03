package com.example.ingram.demo.rest;

import com.example.ingram.demo.dao.StudentDAO;
import com.example.ingram.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private StudentDAO studentDAO;

    @Autowired
    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/getAllStudents")
    public Object getAllStudents() {
        return studentDAO.findAll();
    }

    @PostMapping("/createStudent")
    public Object createStudent(@RequestBody Student student) {
        student.setId(0);
        return studentDAO.save(student);
    }


}
