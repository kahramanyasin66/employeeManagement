package com.kahraman.employeeRecords.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kahraman.employeeRecords.entities.concretes.Winner;

public interface WinnerRepository extends JpaRepository<Winner, Integer> {
	
	Winner findById(int id);

}
