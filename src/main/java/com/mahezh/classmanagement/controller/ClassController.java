package com.mahezh.classmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/students/edit/{id}")
	public String editStudentDetaild(@PathVariable Long id, Model model) {
		model.addAttribute("classm", classService.getStudentDetailById(id));
		return "edit_student_details";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("class") ClassM classm, Model model) {
		
		ClassM existingStudent = classService.getStudentDetailById(id);
		existingStudent.setId(id);
		existingStudent.setCourseName(classm.getCourseName());
		existingStudent.setCourseNumber(classm.getCourseNumber());
		existingStudent.setStudentName(classm.getStudentName());
		existingStudent.setGuardianName(classm.getGuardianName());
		existingStudent.setAddress(classm.getAddress());
		existingStudent.setContactNumber(classm.getContactNumber());
		existingStudent.setEmailAddress(classm.getEmailAddress());

		


		classService.updateStudentDetails(existingStudent);
		return "redirect:/student_details";
	}
}
