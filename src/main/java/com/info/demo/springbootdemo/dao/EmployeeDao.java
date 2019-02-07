package com.info.demo.springbootdemo.dao;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.info.demo.springbootdemo.domain.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	 Employee findByName(String name);
	 
//	 @Query(value ="select id,name from Employee where id=:id")
//	 Employee findUserByIdDate(@Param("id")int id);
	 
	 
	 
	 @Query(value ="SELECT * FROM EMPLOYEE WHERE ID = ?1 AND created_date=?2" , nativeQuery=true)
	 Employee findUserByIdDate(int id , String created_date);
}
