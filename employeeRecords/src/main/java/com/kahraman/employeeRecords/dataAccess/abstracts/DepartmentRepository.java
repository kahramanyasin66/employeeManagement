package com.kahraman.employeeRecords.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kahraman.employeeRecords.entities.concretes.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
