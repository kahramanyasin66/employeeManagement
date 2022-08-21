package com.kahraman.employeeRecords.entities.concretes;

import java.time.LocalDate;

import com.kahraman.employeeRecords.entities.abstracts.Entity;

public class Payroll implements Entity {
	private int id;
	private LocalDate creatingDate; // bodro oluşturma tarihi
	private String registrationNumber; // çalıştığı şirketin sicil numarası
	private double salary;

	public Payroll() {

	}

	public Payroll(int id, LocalDate creatingDate, String registrationNumber, double salary) {

		this.id = id;
		this.creatingDate = creatingDate;
		this.registrationNumber = registrationNumber;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCreatingDate() {
		return creatingDate;
	}

	public void setCreatingDate(LocalDate creatingDate) {
		this.creatingDate = creatingDate;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
