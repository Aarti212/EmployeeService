package com.springboot.restfull.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.restfull.api.model.Employee;
import com.springboot.restfull.api.repositary.EmployeeRepository;

@Service
public class MyEmployeeServiceImpl implements MyEmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;

	 @Override 
	 public Employee saveEmp(Employee emp,HttpStatus created) 
	 {
		 System.out.println("inside service iml class" + emp.Name);
		 return employeeRepo.save(emp); }

	@Override
	public List<Employee> showAllEmps() {

		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> findById(long id) {
		return employeeRepo.findById(id);
	}
	 


}
