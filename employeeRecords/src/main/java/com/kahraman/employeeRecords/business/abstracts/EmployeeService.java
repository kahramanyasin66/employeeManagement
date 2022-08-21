package com.kahraman.employeeRecords.business.abstracts;

import java.util.List;

import com.kahraman.employeeRecords.business.requests.employees.CreateEmployeeRequest;
import com.kahraman.employeeRecords.business.requests.employees.DeleteEmployeeRequest;
import com.kahraman.employeeRecords.business.requests.employees.UpdateEmployeeRequest;
import com.kahraman.employeeRecords.business.responses.employees.GetEmployeeResponse;
import com.kahraman.employeeRecords.business.responses.employees.ListEmployeeResponse;

public interface EmployeeService {
	
	void add(CreateEmployeeRequest createEmployeeRequest);

	void update(UpdateEmployeeRequest updateEmployeeRequest);

	void delete(DeleteEmployeeRequest deleteEmployeeRequest);

	List<ListEmployeeResponse> getAll();

	GetEmployeeResponse getById(int id);

}
