package com.info.demo.springbootdemo.entitytomapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.dao.EmployeeDaoJPA;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.entityconvertdomain.EmployeeEntity;

@Service
public class EmployeeEntityToMapper {

	@Autowired
	private EmployeeDaoJPA employeeDaoJPA ;
	
	@SuppressWarnings("unchecked")
	public List<EmployeeEntity> getEntityToMapper(List<Employee> ll){
		
		
//		Iterator<Employee> itr=ll.iterator();
//		
//		while(itr.hasNext())
//		{
//		    //System.out.println(itr.next());
//		    System.out.println(itr.next().getId().toString());
//		    System.out.println(itr.next().getAddress().toString());
//		    System.out.println(itr.next().getName().toString());
//		    System.out.println(itr.next().getSalary().toString());
//		}
		List listObj=new ArrayList() ;
//		List listObj = new ArrayList<>();
//		for (int i = 0; i < ll.size(); i++) {
//			System.out.println(ll.get(0).getId());
//			System.out.println(ll.get(1).getName());
//			System.out.println(ll.get(2).getSalary());
//			System.out.println(ll.get(3).getFilelocation());
//		}
		
//		for (Employee employee : ll) {
//			//EmployeeEntity employeeEntity = new EmployeeEntity();
//			Employee emp = new Employee();
//			/*employeeEntity.add(0,employee.getName());
//			employeeEntity.add(1,employee.getFilelocation());
//			employeeEntity.add(2,employee.getSalary());
//			employeeEntity.add(3,employee.getId());*/
//			
//			
//			emp.setId(employee.getId());
//			emp.setName(employee.getName());
//			emp.setSalary(employee.getSalary());
//			emp.setAddress(employee.getAddress());
//			emp.setFilelocation(employee.getFilelocation());
//			
//			listObj.add(emp);
//			
//		}
		
		return listObj;
	}
}
