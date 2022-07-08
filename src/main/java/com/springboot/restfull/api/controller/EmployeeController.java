package com.springboot.restfull.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restfull.api.model.Employee;
import com.springboot.restfull.api.service.MyEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public MyEmployeeService myemployeeservice;
	
	 @PostMapping("emp/add") 
	 public Employee addEmpDetails(@RequestBody Employee emp)
	 { return myemployeeservice.saveEmp(emp,HttpStatus.CREATED); }
	 
	 @GetMapping("emps")
	 public List<Employee> showAll() {
		return myemployeeservice.showAllEmps();
	 }
	 
	 @GetMapping("emp/{id}")
	 public Optional<Employee> showById(@PathVariable (name="id") long id) {
		 return myemployeeservice.findById(id);
	 }
	 
}
