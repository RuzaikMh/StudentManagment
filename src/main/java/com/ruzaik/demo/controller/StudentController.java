package com.ruzaik.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ruzaik.demo.dao.StudentRepo;
import com.ruzaik.demo.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "dash";
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
		mv.addObject("student", student);
		return mv;
	}
	
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(Student student)
	{
		repo.save(student);
		return viewStudents();
	}
}
