package com.example.studentcoursemanagement;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    private final StudentRepository studentrepo;

    public StudentService(StudentRepository studentrepo)
    {
        this.studentrepo = studentrepo;
    }

    public Student save(Student student)
    {
        return studentrepo.save(student);
    }

    public List<Student> findAll()
    {
        return studentrepo.findAll();
    }
}
