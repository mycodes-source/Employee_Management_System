package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Duty;

public interface DutyInterface extends JpaRepository<Duty, Integer>{

}
