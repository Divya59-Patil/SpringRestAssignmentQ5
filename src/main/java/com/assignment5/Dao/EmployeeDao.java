package com.assignment5.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment5.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long>{
	
}
