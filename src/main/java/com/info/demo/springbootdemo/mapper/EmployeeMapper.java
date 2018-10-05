package com.info.demo.springbootdemo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.info.demo.springbootdemo.domain.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee empObj=new Employee();
		empObj.setId(rs.getInt("id"));
		empObj.setName(rs.getString("name"));
		empObj.setAddress(rs.getString("address"));
		empObj.setSalary(rs.getDouble("salary"));
		return empObj;
	}

}
