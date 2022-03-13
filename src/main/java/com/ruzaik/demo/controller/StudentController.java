package com.ruzaik.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String home()
	{
		return "dash";
	}
}
