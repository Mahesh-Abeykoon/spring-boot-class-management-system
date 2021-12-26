package com.mahezh.classmanagement.service;

import java.util.List;

import com.mahezh.classmanagement.model.ClassM;

public interface ClassService {

	
	List<ClassM> getAllDetails();
	
	ClassM saveStudentDetails(ClassM classm);
}
