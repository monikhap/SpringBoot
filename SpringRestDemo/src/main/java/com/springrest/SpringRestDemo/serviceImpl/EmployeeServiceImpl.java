package com.springrest.SpringRestDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.SpringRestDemo.Dto.EmployeeDetails;
import com.springrest.SpringRestDemo.repository.EmployeeRepository;
import com.springrest.SpringRestDemo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository empRepo;

	public boolean saveEmployee(EmployeeDetails employee) {

		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.setEmpId(employee.getEmpId());
		empDetails.setEmpName(employee.getEmpName());
		empDetails.setContact(employee.getContact());
		
		System.out.println(empDetails.getEmpId()+" "+empDetails.getEmpName()+" "+empDetails.getContact());

		empRepo.save(empDetails);

		return true;
	}

	public List<EmployeeDetails> getEmployeeDetails() {

		List<EmployeeDetails> empDetails = empRepo.findAll();

		return empDetails;
	}

	public EmployeeDetails getEmployeeDetailsById(Integer empId) {

		EmployeeDetails employee=empRepo.findById(empId).get();
		
		return employee;
	}

	public boolean updateEmployee(@RequestBody EmployeeDetails employee) {

		EmployeeDetails empDetails = empRepo.findById(employee.getEmpId()).get();
		empDetails.setContact(employee.getContact());
		
		empRepo.save(empDetails);

		return true;
	}
	
	public boolean deleteEmployee(@RequestBody EmployeeDetails employee) {

		EmployeeDetails empDetails = empRepo.findById(employee.getEmpId()).get();

		empRepo.delete(empDetails);

		return true;
	}
}
