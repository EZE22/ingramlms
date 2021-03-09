package com.example.ingram.demo.rest;

import com.example.ingram.demo.entity.Student;
import com.example.ingram.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getAllStudents")
    public Object getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/studentById{studentId}")
    public Object getStudentById(@PathVariable int studentId) {
        return studentService.findById(studentId);
    }

    @PostMapping("/createStudent")
    public Object createStudent(@RequestBody Student student) {
        student.setId(0);
        return studentService.saveOrUpdate(student);
    }

    @PutMapping("/updateStudent")
    public Object updateStudent(@RequestBody Student student) {
        return studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        return studentService.deleteById(studentId);
    }

}
