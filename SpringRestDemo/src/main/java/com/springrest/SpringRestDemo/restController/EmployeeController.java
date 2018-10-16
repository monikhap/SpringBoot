package com.springrest.SpringRestDemo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRestDemo.Dto.EmployeeDetails;
import com.springrest.SpringRestDemo.service.EmployeeService;

@RestController
@RequestMapping("emp/vi")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployee(EmployeeDetails employee) {
		Boolean isSaved = false;

		isSaved = empService.saveEmployee(employee);

		if (isSaved)
			return new ResponseEntity<String>("Employee details saved.", HttpStatus.OK);
		else
			return new ResponseEntity<String>("Unable to save Employee details.", HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/getEmployeeDetails")
	public ResponseEntity<List<EmployeeDetails>> getEmployeeDetails() {

		List<EmployeeDetails> empDetails = empService.getEmployeeDetails();

		return new ResponseEntity<List<EmployeeDetails>>(empDetails, HttpStatus.OK);
	}
	
	@GetMapping("/getEmployeeDetailsById")
	public ResponseEntity<EmployeeDetails> getEmployeeDetailsById(Integer empId) {

		EmployeeDetails empDetails = empService.getEmployeeDetailsById(empId);

		return new ResponseEntity<EmployeeDetails>(empDetails, HttpStatus.OK);
	}

	@DeleteMapping("/deleteEmployee")
	public ResponseEntity<String> deleteEmployee(Integer empId) {

		Boolean isDeleted = false;
		EmployeeDetails empDetails = empService.getEmployeeDetailsById(empId);
		isDeleted = empService.deleteEmployee(empDetails);

		if (isDeleted)
			return new ResponseEntity<String>("Employee details deleted.", HttpStatus.OK);
		else
			return new ResponseEntity<String>("Unable to delete Employee details.", HttpStatus.BAD_REQUEST);
	}

	

}
