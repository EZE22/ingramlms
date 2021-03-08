package com.example.ingram.demo.rest;

import com.example.ingram.demo.entity.StudentProgress;
import com.example.ingram.demo.service.StudentProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentProgressController {

    private final StudentProgressService service;

    @Autowired
    public StudentProgressController(StudentProgressService service) {
        this.service = service;
    }

    @GetMapping("/getProgress")
    public Object getProgress() {
        return service.findAll();
    }

    @GetMapping("/progressById{progressId}")
    public Object getProgress(@PathVariable int progressId) {
        return service.findById(progressId);
    }

    @PostMapping("/createProgress")
    public Object createProgress(@RequestBody StudentProgress studentProgress) {
        return service.saveOrUpdate(studentProgress);
    }


}
