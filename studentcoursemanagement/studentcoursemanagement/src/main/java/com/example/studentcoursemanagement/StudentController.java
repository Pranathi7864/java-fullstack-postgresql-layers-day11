package com.example.studentcoursemanagement;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentservice;

    public StudentController(StudentService studentservice)
    {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<Student> getStudent()
    {
        return studentservice.findAll();
    }

    @PostMapping
    public Student placeStudent(@RequestBody Student student)
    {
        return studentservice.save(student);
    }
}