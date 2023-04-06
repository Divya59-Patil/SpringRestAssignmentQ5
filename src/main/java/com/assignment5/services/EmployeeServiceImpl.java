package com.assignment5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment5.Dao.EmployeeDao;
import com.assignment5.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		
	}
	
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(long employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getReferenceById(employeeId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(long parseLong) {
		Employee entity = employeeDao.getOne(parseLong);
	    employeeDao.delete(entity);
	}

}
