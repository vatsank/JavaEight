package com.training.domains;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

	private long employeeId;
	private String name;
	private LocalDate joinDate;
	private LocalDateTime birthdate;
	private double baseSalary;
	private double bonus;
	
	
	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


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


	public Employee(String name, double baseSalary, double bonus) {
		super();
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}


	public Employee(long employeeId, String name, LocalDate joinDate, LocalDateTime birthdate, double baseSalary,
			double bonus) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.joinDate = joinDate;
		this.birthdate = birthdate;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
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
		return "Employee [name=" + name + ", baseSalary=" + baseSalary + ", bonus=" + bonus + "]";
	}


	
	
}
