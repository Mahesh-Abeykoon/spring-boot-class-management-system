package com.mahezh.classmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mahezh.classmanagement.model.ClassM;
import com.mahezh.classmanagement.service.ClassService;

@Controller
public class ClassController {
	
	private ClassService classService;

	public ClassController(ClassService classService) {
		super();
		this.classService = classService;
	}
	
	@GetMapping("/student_details")
	public String listStudentDetails(Model model) {
		model.addAttribute("student_details", classService.getAllDetails());
		return "student_details";
	}
	
	@GetMapping("/student/new")
	public String createStudentDetailForm(Model model) {
		
		ClassM classm = new ClassM();
		model.addAttribute("classm", classm);
		return "create_new_student";
	}

	@PostMapping("/student_details")
	public String saveStudentDetail(@ModelAttribute("class") ClassM classm) {
		classService.saveStudentDetails(classm);
		return "redirect:/student_details";
	}
}
