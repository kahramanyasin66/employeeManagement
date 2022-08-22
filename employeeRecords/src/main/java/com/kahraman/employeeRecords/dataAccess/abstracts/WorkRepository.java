package com.kahraman.employeeRecords.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kahraman.employeeRecords.entities.concretes.Work;

public interface WorkRepository extends JpaRepository<Work, Integer> {
	
	Work findById(int id);

}
