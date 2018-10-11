package com.springrest.SpringRestDemo.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.SpringRestDemo.Dto.EmployeeDetails;

@Service
@Repository
public interface EmployeeService {
	
	public boolean saveEmployee(@RequestBody EmployeeDetails employee);
	public List<EmployeeDetails> getEmployeeDetails() ;
	public EmployeeDetails getEmployeeDetailsById(Integer empId);
	public boolean updateEmployee(EmployeeDetails employee);
	public boolean deleteEmployee(EmployeeDetails employee);

}
