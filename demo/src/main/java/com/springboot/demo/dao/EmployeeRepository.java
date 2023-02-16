package com.springboot.demo.dao;

import com.springboot.demo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByCompany(Company company);
}
