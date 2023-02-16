package com.springboot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
