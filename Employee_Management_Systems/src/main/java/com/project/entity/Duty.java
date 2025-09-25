package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="duty_table")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Duty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String title;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "assignedByManager")
	private Manager assignedByManager;
	
	@ManyToOne
	@JoinColumn(name = "assignedByAdmin")
	private Admin assignedByAdmin;
	

}
