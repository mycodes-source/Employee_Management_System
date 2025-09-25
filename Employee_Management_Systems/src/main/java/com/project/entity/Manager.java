package com.project.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="manager_table")
@Getter
@Setter


public class Manager {
	@Id
	private Long id;
	
	@Column(name = "name",nullable=false,unique=true)
	private String name;
	
	@Column(name = "email",nullable=false,unique=true)
	private String email;
	
	@Column(name = "password",nullable=false,unique=true)
	private String password;
	
	@Column(name = "department",nullable=false,unique=true)
	private String department;
	
	@Column(name = "phoneno",nullable=false,unique=true)
	private String phoneno;
	
	@OneToMany(mappedBy = "manager",cascade = CascadeType.ALL)
	private List<Employee> employees;
	
	@OneToMany(mappedBy = "assignedByManager" , cascade =CascadeType.ALL )
	private List<Duty> duties_assigned;

}
