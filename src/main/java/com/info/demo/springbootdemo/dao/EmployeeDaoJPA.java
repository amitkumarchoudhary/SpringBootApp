package com.info.demo.springbootdemo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.demo.springbootdemo.domain.Employee;

@Repository
public interface EmployeeDaoJPA extends JpaRepository<Employee,Integer>{

	@Query(value ="select employee_id,first_name ,email,filelocation,salary from Employee ")
    List<Employee> findAllUserDetails();
	
	@Query(value="SELECT Employee.employee_id,Employee.created_date ,Employee.email,Employee.first_name,Employee.filelocation,Employee.last_name,Employee.phone_number,Employee.salary,Employee.updated_date,"
	 		+ "Departments.department_id,Departments.department_name,"
	 		+ "Location.location_id,Location.street_adress,"
	 		+ "Country.country_id,Country.country_name,"
	 		+ "Regions.region_id,Regions.region_name"
	 		+ " FROM  "
	 		+ "(((("
	 		+ " Employee"
            +" INNER JOIN Departments ON  Employee.department_id               = Departments.department_id)"
            +" INNER JOIN Location    ON  Departments.department_id            = Location.location_id)"
            +" INNER JOIN Country     ON  Location.location_id                 = Country.country_id)"
            + "INNER JOIN Regions     ON  Country.country_id                   = Regions.region_id )"
            + "WHERE Regions.region_id=?1" , nativeQuery=true)
	List<Employee> findUserByRegionId(Integer region_id);
	
	@Query(value="SELECT Employee.employee_id,Employee.created_date ,Employee.email,Employee.first_name,Employee.filelocation,Employee.last_name,Employee.phone_number,Employee.salary,Employee.updated_date,"
	 		+ "Departments.department_id,Departments.department_name,"
	 		+ "Location.location_id,Location.street_adress,"
	 		+ "Country.country_id,Country.country_name,"
	 		+ "Regions.region_id,Regions.region_name"
	 		+ " FROM  "
	 		+ "(((("
	 		+ " Employee"
            +" INNER JOIN Departments ON  Employee.department_id               = Departments.department_id)"
            +" INNER JOIN Location    ON  Departments.department_id            = Location.location_id)"
            +" INNER JOIN Country     ON  Location.location_id                 = Country.country_id)"
            + "INNER JOIN Regions     ON  Country.country_id                   = Regions.region_id )" , nativeQuery=true)
	List<Employee> findUserByRegionByDefault();
}
