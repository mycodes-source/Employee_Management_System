package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}
