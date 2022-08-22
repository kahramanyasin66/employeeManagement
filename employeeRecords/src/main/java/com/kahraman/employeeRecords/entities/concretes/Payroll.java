package com.kahraman.employeeRecords.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="payrolls")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="creating_date")	
	private LocalDate creatingDate;
	
	@Column(name="registration_number")	
	private String registrationNumber;
	
	@Column(name="salary")	
	private double salary;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

}
