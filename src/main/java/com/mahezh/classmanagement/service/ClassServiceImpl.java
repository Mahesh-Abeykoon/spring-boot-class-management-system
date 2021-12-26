package com.mahezh.classmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mahezh.classmanagement.model.Class;
import com.mahezh.classmanagement.repository.ClassRepository;

@Service
public class ClassServiceImpl implements ClassService {

	
	private ClassRepository classRepository;
	
	public ClassServiceImpl(ClassRepository classRepository) {
		super();
		this.classRepository = classRepository;
	}

	
	
	@Override
	public List<Class> getAllDetails() {

		
		return classRepository.findAll();
	}

	
}
