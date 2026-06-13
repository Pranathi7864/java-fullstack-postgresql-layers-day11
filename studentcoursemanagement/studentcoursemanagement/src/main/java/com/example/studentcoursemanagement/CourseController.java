package com.example.studentcoursemanagement;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseservice;

    public CourseController(CourseService courseservice)
    {
        this.courseservice = courseservice;
    }

    @GetMapping
    public List<Course> getCourse()
    {
        return courseservice.findAll();
    }

    @PostMapping
    public Course placeCourse(@RequestBody Course course)
    {
        return courseservice.save(course);
    }
}
