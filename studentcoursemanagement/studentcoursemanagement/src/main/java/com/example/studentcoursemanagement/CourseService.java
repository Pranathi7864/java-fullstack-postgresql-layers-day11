package com.example.studentcoursemanagement;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CourseService {
    private final CourseRepository courserepo;

    public CourseService(CourseRepository courserepo)
    {
        this.courserepo = courserepo;
    }

    public Course save(Course course)
    {
        return courserepo.save(course);
    }

    public List<Course> findAll()
    {
        return courserepo.findAll();
    }



}
