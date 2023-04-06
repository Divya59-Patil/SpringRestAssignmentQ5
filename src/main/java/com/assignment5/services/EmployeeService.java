package com.assignment5.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment5.entities.Employee;


@Service
public interface EmployeeService {
	
	public List<Employee> getEmployee();
	public Employee getEmployee(long employeeId);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(long parseLong);

}
