package com.kahraman.employeeRecords.entities.concretes;

import com.kahraman.employeeRecords.entities.abstracts.Entity;

public class Department implements Entity {
	private int id;
	private String name;
	private String departmentNumber;

	public Department() {

	}

	public Department(int id, String name, String departmentNumber) {
		
		this.id = id;
		this.name = name;
		this.departmentNumber = departmentNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(String departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

}
