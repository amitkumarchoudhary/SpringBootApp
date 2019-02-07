package com.info.demo.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.demo.springbootdemo.domain.Permission;

@Repository
public interface PermissionDao extends JpaRepository<Permission, Integer>{

}
