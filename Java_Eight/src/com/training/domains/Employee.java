package com.training.domains;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

	private long employeeId;
	private String name;
	private LocalDate joinDate;
	private LocalDateTime birthdate;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(long employeeId, String name, LocalDate joinDate, LocalDateTime birthdate) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.joinDate = joinDate;
		this.birthdate = birthdate;
	}


	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public LocalDateTime getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDateTime birthdate) {
		this.birthdate = birthdate;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", joinDate=" + joinDate + ", birthdate="
				+ birthdate + "]";
	}
	
}
