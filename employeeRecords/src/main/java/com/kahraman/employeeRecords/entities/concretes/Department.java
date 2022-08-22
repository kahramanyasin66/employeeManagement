package com.kahraman.employeeRecords.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "departments")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
    
	@Column(name ="department_name")
	private String departmentName;
	
	@Column(name="department_number")
	private String departmentNumber;
	
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
	
	@ManyToOne
	@JoinColumn(name = "office_id")
	private Office office;
	

}
