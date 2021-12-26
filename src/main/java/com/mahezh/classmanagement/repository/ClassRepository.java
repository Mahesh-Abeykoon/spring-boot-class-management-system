package com.mahezh.classmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahezh.classmanagement.model.Class;

public interface ClassRepository extends JpaRepository<Class, Long>{

}
