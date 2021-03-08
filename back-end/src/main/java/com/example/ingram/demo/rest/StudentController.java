package com.example.ingram.demo.rest;

import com.example.ingram.demo.entity.Student;
import com.example.ingram.demo.entity.StudentProgress;
import com.example.ingram.demo.service.StudentProgressService;
import com.example.ingram.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentService studentService;
    private final StudentProgressService progressService;

    @Autowired
    public StudentController(StudentService studentService, StudentProgressService progressService) {
        this.studentService = studentService;
        this.progressService = progressService;
    }

    @GetMapping("/getAllStudents")
    public Object getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/studentById{studentId}")
    public Object getStudentById(@PathVariable int studentId) {
        return studentService.findById(studentId);
    }

    @GetMapping("/test/{studentId}/{progressId}")
    public String getStudentProgress(@PathVariable int studentId, @PathVariable int progressId) {
        Student temp = studentService.findById(studentId);
        StudentProgress progress = progressService.findById(progressId);
        temp.setStudentProgress(progress);
        return temp.toString();
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
