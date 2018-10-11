package com.springrest.SpringRestDemo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.SpringRestDemo.Dto.EmployeeDetails;

@Transactional
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer>{

}
