package com.info.demo.springbootdemo.cache;

import org.springframework.stereotype.Service;
import com.info.demo.springbootdemo.domain.Employee;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsCache
{
    @Cacheable("employee")
    public Employee getEmployeeByID(String id)
    {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        return new Employee();
    }
}

