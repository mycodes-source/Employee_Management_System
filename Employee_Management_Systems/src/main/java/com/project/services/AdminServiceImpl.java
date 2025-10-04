package com.project.services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Admin;
import com.project.entity.Duty;
import com.project.entity.Employee;
import com.project.entity.Leaves;
import com.project.entity.Manager;
import com.project.repository.AdminRepository;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin checkAdminLogin(String name, String password) {
		return adminRepository.findByNameAndPassword(name, password);
	}

	@Override
	public Manager addManager(Manager manager) {
		int manager_id = generateRandomManagerId();
		return manager;
	
	}

	@Override
	public List<Manager> viewAllManagers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> viewEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long managercount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long employeecount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String assignedToManager(Duty duty, int managerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String assignedToEmployee(Duty duty, int employeeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Leaves> viewAllLeaveApplications() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int generateRandomManagerId()
	{
		Random random = new Random();
		
		return 1000 + random.nextInt(9000);
	}

	private String generateRandomPassword(int length) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "!@#$%^&&*()";
		
		String combined = upper+lower+digits+special;
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		sb.append(upper.charAt(random.nextInt(upper.length())));
		sb.append(lower.charAt(random.nextInt(lower.length())));
		sb.append(digits.charAt(random.nextInt(digits.length())));
		sb.append(special.charAt(random.nextInt(special.length())));
		
		for(int i = 4;i < length;i++) {
			sb.append(combined.charAt(random.nextInt(combined.length())));
		}
		
		
		return sb.toString();
	}
}
