package com.info.demo.springbootdemo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.demo.springbootdemo.domain.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	 Employee findByName(String name);
}
