package com.ruzaik.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ruzaik.demo.dao.CourseRepo;
import com.ruzaik.demo.dao.StudentRepo;
import com.ruzaik.demo.model.Course;
import com.ruzaik.demo.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	@Autowired
	CourseRepo courseRepo;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		List<Course> coList = courseRepo.findAll();
		ModelAndView mv = new ModelAndView("dash");
		mv.addObject("courseList", coList);
		return mv;
	}
	
	@RequestMapping("/RegisterStudents")
	public String register(Student student)
	{
		repo.save(student);
		return "dash";
	}
	
	@RequestMapping("/viewStudents")
	public ModelAndView viewStudents()
	{
		List<Student> studentList = repo.findAll();
		ModelAndView mv = new ModelAndView("viewRegisteredStudents");
		mv.addObject("sList", studentList);
		
		return mv;
	}
	
	@RequestMapping("/deleteStudent")
	public ModelAndView delete(String delete) 
	{
		repo.deleteById(delete);
		return viewStudents();
	}
	
	@RequestMapping("/updateStudentPage")
	public ModelAndView updatePage(String update) 
	{
		ModelAndView mv = new ModelAndView("updateStudent");
		Student student = repo.getById(update);
		List<Course> coList = courseRepo.findAll();
		mv.addObject("student", student);
		mv.addObject("courseList", coList);
		return mv;
	}
	
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(Student student)
	{
		repo.save(student);
		return viewStudents();
	}
	
	@RequestMapping("/serach")
	public ModelAndView search(String search)
	{
		List<Student> students = repo.findByStudentNameLike(search);
		ModelAndView mv = new ModelAndView("viewRegisteredStudents");
		mv.addObject("sList", students);
		return mv;
	}
}
