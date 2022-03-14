package com.ruzaik.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruzaik.demo.dao.CourseRepo;
import com.ruzaik.demo.model.Course;

@Controller
public class CourseController {

	@Autowired
	CourseRepo repo;
	
	@RequestMapping("/course")
	public String course()
	{
		return "courseCreation";
	}
	
	@RequestMapping("/addCourse")
	public String addCourse(Course course)
	{
		repo.save(course);
		return course();
	}
}
