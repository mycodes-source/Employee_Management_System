package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Employee;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	//search functionality
	List<Employee> findByNameContainingIgnoreCase(String name);
	
//	List<Employee> findByName(String name);
}
