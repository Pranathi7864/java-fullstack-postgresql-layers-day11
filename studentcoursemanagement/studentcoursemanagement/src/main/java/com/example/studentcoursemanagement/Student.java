package com.example.studentcoursemanagement;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;
    private String studentname;
    private Long courseid;
    public Student(){}
    public Student(String studentname)
    {
        this.studentname=studentname;

    }
    public Long getStudentid()
    {
        return studentid;
    }
    public String getStudentname()
    {
        return studentname;
    }
    public Long getCourseid()
    {
        return courseid;
    }
}
