package com.project.entity;

import java.time.LocalDate;

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
@Table(name="leave_table")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Leaves {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(nullable = false)
	private LocalDate startDate;
	private LocalDate enddate;
	private String reason;
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
	private Employee employee;
}
