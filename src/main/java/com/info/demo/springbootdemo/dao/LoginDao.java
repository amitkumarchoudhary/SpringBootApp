package com.info.demo.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.info.demo.springbootdemo.domain.Login;

public interface LoginDao extends JpaRepository<Login, Integer>{

}
