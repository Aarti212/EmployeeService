package com.springboot.restfull.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import com.springboot.restfull.api.model.Employee;

public interface MyEmployeeService {
	
		public Employee saveEmp(Employee emp, HttpStatus created);
		public List<Employee> showAllEmps();
		public Optional<Employee> findById(long id);
}
