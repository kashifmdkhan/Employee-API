package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.entities.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>{
	
}
	