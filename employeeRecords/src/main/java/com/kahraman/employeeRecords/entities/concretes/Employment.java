package com.kahraman.employeeRecords.entities.concretes;

import com.kahraman.employeeRecords.entities.abstracts.Entity;

public class Employment implements Entity {
	private int id;
	private String name;

	public Employment() {

	}

	public Employment(int id, String name) {

		this.id = id;
		this.name = name;
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

}
