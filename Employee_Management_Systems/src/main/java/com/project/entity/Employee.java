package com.project.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_details")

public class Employee {
	
	@Id
	@Column(name="emp_id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	
	@Column(name = "emp_name",unique = true)
	private String name;
	
	@Column(name = "emp_email",nullable = false)
	private String EMail;
	
	@Column(name = "emp_password",nullable = false)
	private String Password;
	
	@Column(name = "emp_gender",nullable = false)
	private String gender;
	
	@Column(name = "emp_job",nullable = false)
	private String Designation;
	
	@Column(name = "emp_dept",nullable = false)
	private String Department;
	
	@Column(name = "emp_salary",nullable = false)
	private double Salary;
	
	@Column(name = "emp_username",nullable = false,unique = true)
	private String username;
	
	@Column(name = "emp_phoneno",nullable = false,unique = true)
	private String Phone_no;
	
	@OneToMany(mappedBy="Id",cascade = CascadeType.ALL)
	private List<Leaves> leaves;
	
	@OneToMany(mappedBy = "id" , cascade = CascadeType.ALL)
	private List<Duty> duties;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Manager manager;
	

}
