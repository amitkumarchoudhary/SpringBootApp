package com.info.demo.springbootdemo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.domain.Regions;

@Repository
public interface RegionsDao extends JpaRepository<Regions,Integer>{

//	@Query(value ="select region_id,region_name from Regions ")
//    public List<Regions> findAllRegions();

}
