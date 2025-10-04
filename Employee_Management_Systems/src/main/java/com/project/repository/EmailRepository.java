package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer>{

}
