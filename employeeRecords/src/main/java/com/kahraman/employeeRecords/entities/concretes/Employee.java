package com.kahraman.employeeRecords.entities.concretes;

import java.time.LocalDate;

import com.kahraman.employeeRecords.entities.abstracts.Entity;

public class Employee implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private String email;
	private LocalDate startedDate; // işe başlama tarihi 
	private LocalDate dueDate;
	public Employee() {
		
	}
	public Employee(int id, String firstName, String lastName, String identityNumber, String email,
			LocalDate startedDate, LocalDate dueDate) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.email = email;
		this.startedDate = startedDate;
		this.dueDate = dueDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getStartedDate() {
		return startedDate;
	}
	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	
	

}
