package com.kahraman.employeeRecords.entities.concretes;

import com.kahraman.employeeRecords.entities.abstracts.Entity;

public class Office implements Entity {
	private int id;
	private String name;
	private String address;
	private String officePhone;

	public Office() {

	}

	public Office(int id, String name, String address, String officePhone) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.officePhone = officePhone;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

}
