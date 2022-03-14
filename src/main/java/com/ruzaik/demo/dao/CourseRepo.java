package com.ruzaik.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruzaik.demo.model.Course;

public interface CourseRepo extends JpaRepository<Course, String>{

}
