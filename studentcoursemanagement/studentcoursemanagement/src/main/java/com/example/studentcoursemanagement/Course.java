package com.example.studentcoursemanagement;

import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseid;
    private String coursename;
    private Long studentid;
    public Course(){}
public Course(String coursename)
{
this.coursename=coursename;
}
public Long getCourseid()
{
    return courseid;
}
public String getCoursename()
{
    return coursename;
}
public Long getStudentid()
{
    return studentid;
}
}
