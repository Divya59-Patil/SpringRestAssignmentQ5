package com.assignment5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment5.entities.Employee;
import com.assignment5.services.EmployeeService;


@RestController
public class MainController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Employee Management System";
	}
	
	//get the employee
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return this.employeeService.getEmployee();
	}
	
    //get one employee using id
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		return this.employeeService.getEmployee(Long.parseLong(employeeId));
	}
	
	//add employee
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}
	
	//update employee using put request
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}
	
	//delete course using delete request
	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId){
		try {
			this.employeeService.deleteEmployee(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
	
	
}
