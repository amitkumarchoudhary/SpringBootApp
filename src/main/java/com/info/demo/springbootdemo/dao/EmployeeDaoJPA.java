package com.info.demo.springbootdemo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.demo.springbootdemo.domain.Employee;

@Repository
public interface EmployeeDaoJPA extends JpaRepository<Employee,Integer>{

	@Query(value ="select id,name from Employee ")
    List<Employee> findAllUserDetails();
}
