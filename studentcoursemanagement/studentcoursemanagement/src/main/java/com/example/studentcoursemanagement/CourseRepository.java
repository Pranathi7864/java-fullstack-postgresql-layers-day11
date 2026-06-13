package com.example.studentcoursemanagement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

    <S extends Course> S save(S entity);
}
