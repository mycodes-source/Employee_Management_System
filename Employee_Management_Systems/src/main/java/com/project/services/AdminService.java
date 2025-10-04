package com.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.Admin;
import com.project.entity.Duty;
import com.project.entity.Employee;
import com.project.entity.Leaves;
import com.project.entity.Manager;

@Service
public interface AdminService {
	public Admin checkAdminLogin(String name,String password);
	
	public Manager addManager(Manager manager);
	public List<Manager> viewAllManagers();
	
	public String deleteManager();
	public List<Employee> viewEmployees();
	public String deleteEmployee();
	public long managercount();
	public long employeecount();
	
	public String assignedToManager(Duty duty,int managerid);
	public String assignedToEmployee(Duty duty,int employeeid);
	
	public List<Leaves> viewAllLeaveApplications();
	
	
	
}
