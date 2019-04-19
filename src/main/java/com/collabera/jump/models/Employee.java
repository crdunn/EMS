package com.collabera.jump.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Employee extends Person {
	
	@Id
	@GeneratedValue
	private int empId;
	
	//@Column(unique=true)
	//@Pattern(regexp="[0-9]{5}", message="An Employee's ID must be 5 digits")
	private String employeeId;

	private DEPARTMENT department;
	private String jobTitle;
	private int salary;
	private String reportsTo;
	


	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public DEPARTMENT getDepartment() {
		return department;
	}

	public void setDepartment(DEPARTMENT department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return super.toString() + " Employee [empId=" + empId + ", employeeId=" + employeeId + ", department=" + department + ", jobTitle="
				+ jobTitle + ", salary=" + salary + ", reportsTo=" + reportsTo + "]";
	}
	
	
}
