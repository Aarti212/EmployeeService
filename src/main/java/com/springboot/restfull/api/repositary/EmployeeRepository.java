package com.springboot.restfull.api.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restfull.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
