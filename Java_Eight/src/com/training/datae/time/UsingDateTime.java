package com.training.datae.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import com.training.domains.Employee;

public class UsingDateTime {

	public static LocalDate findRetierment(LocalDate birthDate){
		
		return birthDate.plusYears(58);
		
	
	}
	
	public static void main(String[] args) {

		Employee emp = new Employee();
		
		emp.setEmployeeId(101);
		emp.setName("Ramesh");
		
		emp.setBirthdate(LocalDateTime.of(1996,10, 12, 5, 30));
		
		emp.setJoinDate(LocalDate.now());
		
		System.out.println("Your Birthdate is"+emp);
		System.out.println("You will retire on "+ findRetierment(emp.getBirthdate().toLocalDate()));
		
		System.out.println("Your Time Zone"+ ZoneId.systemDefault());
		
		System.out.println("Your Time Zone"+ ZoneId.getAvailableZoneIds());
		
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
		
	}

}
