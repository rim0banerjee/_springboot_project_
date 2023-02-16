package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.entity.Company;
//import com.springboot.cruddemo.entity.Employee;

public interface CompanyService {
	
	public List<Company> findAll();
	
	public Company findById(int theId);
	
	public void save(Company theCompany);
	
	public void deleteById(int theId);

}
