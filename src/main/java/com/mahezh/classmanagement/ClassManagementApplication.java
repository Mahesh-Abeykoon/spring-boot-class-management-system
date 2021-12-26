package com.mahezh.classmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mahezh.classmanagement.model.ClassM;
import com.mahezh.classmanagement.repository.ClassRepository;

@SpringBootApplication
public class ClassManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ClassManagementApplication.class, args);
	}

	@Autowired
	private ClassRepository classRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		ClassM class1 = new ClassM("ICT", 2,"Mahesh Abeykoon", "Mr.Abeykoon","No 03/ Colombo, Sri Lanka",717575786,"maheshpabeykoon@gmail.com");
//		classRepository.save(class1);
//		
//		ClassM class2 = new ClassM("CS", 2,"Mah Eshh ", "Mr.Abeykoon","No 03/ Colombo, Sri Lanka",+717575786,"maheshabeykoon@gmail.com");
//		classRepository.save(class2);
		
		
		
	}
	
}
