package com.kahraman.employeeRecords.business.abstracts;

import java.util.List;

import com.kahraman.employeeRecords.business.requests.employments.CreateEmploymentRequest;
import com.kahraman.employeeRecords.business.requests.employments.DeleteEmploymentRequest;
import com.kahraman.employeeRecords.business.requests.employments.UpdateEmploymentRequest;
import com.kahraman.employeeRecords.business.responses.employments.GetEmploymentResponse;
import com.kahraman.employeeRecords.business.responses.employments.ListEmploymentResponse;

public interface EmploymentService {
	
	void add(CreateEmploymentRequest createEmploymentRequest);

	void update(UpdateEmploymentRequest updateEmploymentRequest);

	void delete(DeleteEmploymentRequest deleteEmploymentRequest);

	List<ListEmploymentResponse> getAll();

	GetEmploymentResponse getById(int id);

}
