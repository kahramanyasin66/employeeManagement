package com.kahraman.employeeRecords.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kahraman.employeeRecords.entities.concretes.Employment;

public interface EmploymentRepository extends JpaRepository<Employment, Integer>{

}
