package com.springboot.restfull.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Column(name="Nmae")
	public String Name;
	
	@Id
	@Column(name="EmpID")
	public long EmpID;
	
	@Column(name="Job")
	public String Job;
	
	@Column(name="Salary")
	public long Salary;
	
	public Employee() {
		super();
	}
	
	
}
