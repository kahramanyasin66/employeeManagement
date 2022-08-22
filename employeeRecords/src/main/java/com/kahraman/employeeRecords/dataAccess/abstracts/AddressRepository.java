package com.kahraman.employeeRecords.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kahraman.employeeRecords.entities.concretes.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
 
	Address findById(int id);
	
}
