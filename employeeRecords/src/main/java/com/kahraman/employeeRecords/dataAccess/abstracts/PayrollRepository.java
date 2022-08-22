package com.kahraman.employeeRecords.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kahraman.employeeRecords.entities.concretes.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Integer> {

	Payroll findById(int id);
	
}
