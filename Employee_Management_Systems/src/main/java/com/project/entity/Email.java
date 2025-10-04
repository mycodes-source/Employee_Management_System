package com.project.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="email_details")

public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(nullable = false)
    private String recipient;
	
	@Column(nullable = false,length = 1000)
    private String subject;
	
	@Column(nullable = false)
    private String message;
	
	@Column(nullable = false)
    private LocalDateTime sentAt;
	
	@Column(nullable = false)
    private String status;
	
}
