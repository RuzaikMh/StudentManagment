package com.ruzaik.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ruzaik.demo.dao.StudentFeeRepo;
import com.ruzaik.demo.dao.StudentRepo;
import com.ruzaik.demo.model.Student;
import com.ruzaik.demo.model.StudentFee;

@Controller
public class StudentFeeController {
	
	@Autowired
	StudentFeeRepo repo;
	@Autowired
	StudentRepo studentRepo;
	
	@RequestMapping("/addStudentFeePage")
	public ModelAndView addStudentFeePage()
	{
		List<Student> students = studentRepo.findAll();
		ModelAndView mv = new ModelAndView("AddStudentFee");
		mv.addObject("students", students);
		return mv;
	}
	
	@RequestMapping("/addStudentFee")
	public ModelAndView addStudentFee(StudentFee studentFee)
	{
		repo.save(studentFee);
		return addStudentFeePage();
	}
	
	@RequestMapping("/viewStudentFee")
	public ModelAndView viewStudentFee()
	{
		List<StudentFee> studentFees = repo.findAll();
		ModelAndView mv = new ModelAndView("viewStudentFee");
		mv.addObject("studentFees", studentFees);
		return mv;
	}
	
	@RequestMapping("/deleteStudentFee")
	public ModelAndView deleteStudentFee(int id)
	{
		repo.deleteById(id);
		return viewStudentFee();
	}

}
