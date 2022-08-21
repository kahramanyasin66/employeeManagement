package com.kahraman.employeeRecords.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kahraman.employeeRecords.business.abstracts.EmploymentService;
import com.kahraman.employeeRecords.business.requests.employments.CreateEmploymentRequest;
import com.kahraman.employeeRecords.business.requests.employments.DeleteEmploymentRequest;
import com.kahraman.employeeRecords.business.requests.employments.UpdateEmploymentRequest;
import com.kahraman.employeeRecords.business.responses.employments.GetEmploymentResponse;
import com.kahraman.employeeRecords.business.responses.employments.ListEmploymentResponse;
import com.kahraman.employeeRecords.dataAccess.abstracts.EmploymentRepository;

@Service
public class EmploymentManager implements EmploymentService {

	private EmploymentRepository employmentRepository;

	@Autowired
	public EmploymentManager(EmploymentRepository employmentRepository) {

		this.employmentRepository = employmentRepository;
	}

	@Override
	public void add(CreateEmploymentRequest createEmploymentRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UpdateEmploymentRequest updateEmploymentRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DeleteEmploymentRequest deleteEmploymentRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ListEmploymentResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetEmploymentResponse getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
