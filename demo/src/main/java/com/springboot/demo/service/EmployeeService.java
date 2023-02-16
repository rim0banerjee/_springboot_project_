package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.entity.Company;
import com.springboot.demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee, Company company);
	
	public void deleteById(int theId);

	public List<Employee> fetchCompanyEmployees(Company company);

	public boolean delete(List<Employee> employees);
}
