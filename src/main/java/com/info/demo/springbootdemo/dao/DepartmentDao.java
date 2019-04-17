package com.info.demo.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.demo.springbootdemo.domain.Departments;

public interface DepartmentDao extends JpaRepository<Departments, Integer>{

}
