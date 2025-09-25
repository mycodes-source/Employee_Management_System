package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Leaves;

public interface LeaveRepository extends JpaRepository<Leaves, Integer>{

//	public findByEmployee
	
}
