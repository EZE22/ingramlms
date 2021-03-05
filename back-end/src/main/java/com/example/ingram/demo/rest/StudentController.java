package com.example.ingram.demo.rest;

import com.example.ingram.demo.dao.myDAO;
import com.example.ingram.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final myDAO myDAO;

    @Autowired
    public StudentController(myDAO myDAO) {
        this.myDAO = myDAO;
    }

    @GetMapping("/getAllStudents")
    public Object getAllStudents() {
        return myDAO.findAll();
    }

    @PostMapping("/createStudent")
    public Object createStudent(@RequestBody Student student) {
        student.setId(0);
        return myDAO.saveOrUpdate(student);
    }

    @PutMapping("/updateStudent")
    public Object updateStudent(@RequestBody Student student) {
        return myDAO.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        return myDAO.deleteById(studentId);
    }

}
