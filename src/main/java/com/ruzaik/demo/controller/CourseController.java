package com.ruzaik.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/viewCourse")
	public ModelAndView viewCourse()
	{
		List<Course> courseList = repo.findAll();
		ModelAndView mv = new ModelAndView("viewCourse");
		mv.addObject("courseList", courseList);

		return mv;
	}
	
	@RequestMapping("/deleteCourse")
	public ModelAndView deleteCourse(String courseID)
	{
		Course course = repo.getById(courseID);
		repo.delete(course);
		return viewCourse();
	}
	
	@RequestMapping("/updateCoursePage")
	public ModelAndView updateCoursePage(String courseID)
	{
		Course course = repo.getById(courseID);
		ModelAndView mv = new ModelAndView("updateCourse");
		mv.addObject("course", course);
		
		return mv;
	}
	
	@RequestMapping("/updateCourse")
	public ModelAndView updateCourse(Course course)
	{
		repo.save(course);
		return viewCourse();
	}
	
	@RequestMapping("/searchCourse")
	public ModelAndView search(String search)
	{
		List<Course> courseList = repo.findByCourseNameLike(search);
		ModelAndView mv = new ModelAndView("viewCourse");
		mv.addObject("courseList", courseList);
		return mv;
	}
}
