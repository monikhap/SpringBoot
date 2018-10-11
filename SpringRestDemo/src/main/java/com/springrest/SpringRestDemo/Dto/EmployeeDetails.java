package com.springrest.SpringRestDemo.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {
	
	@Id
	public int empId;
	
	public String empName;
	
	public double contact;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	
}
