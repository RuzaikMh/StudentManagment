package com.ruzaik.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ruzaik.demo.dao.AttendanceRepo;
import com.ruzaik.demo.dao.StudentRepo;
import com.ruzaik.demo.model.Student;
import com.ruzaik.demo.model.StudentAttendance;

@Controller
public class StudentAttendanceController {

	@Autowired
	StudentRepo studentRepo;
	@Autowired
	AttendanceRepo repo;
	
	@RequestMapping("/addAttendancePage")
	public ModelAndView addAttendancePage()
	{
		List<Student> sList = studentRepo.findAll();
		ModelAndView mv = new ModelAndView("addStudentAttendance");
		mv.addObject("studentList", sList);
		return mv;
	}
	
	@RequestMapping("/addAttendance")
	public ModelAndView addattendance(StudentAttendance attendance) 
	{
		repo.save(attendance);
		return addAttendancePage();
	}
	
	@RequestMapping("/viewAttendance")
	public ModelAndView viewAttendance() 
	{
		List<StudentAttendance> studentAttendances = repo.findAll();
		ModelAndView mv = new ModelAndView("viewAttendance");
		mv.addObject("studentAttendances", studentAttendances);
		return mv;
	}
	
	@RequestMapping("/deleteAttendance")
	public ModelAndView deleteAttendance(@RequestParam("id") int aid)
	{
		repo.deleteById(aid);
		return viewAttendance();
	}
	
	@RequestMapping("/searchAttendance")
	public ModelAndView searchAttendance(@RequestParam("search") String sid)
	{
		List<StudentAttendance> sAttendances = repo.findByRegistrationLike(sid);
		ModelAndView mv = new ModelAndView("viewAttendance");
		mv.addObject("studentAttendances", sAttendances);
		return mv;
	}
	
}
