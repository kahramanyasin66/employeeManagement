package com.kahraman.employeeRecords.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kahraman.employeeRecords.business.abstracts.EmployeeService;
import com.kahraman.employeeRecords.business.requests.employees.CreateEmployeeRequest;
import com.kahraman.employeeRecords.business.requests.employees.DeleteEmployeeRequest;
import com.kahraman.employeeRecords.business.requests.employees.UpdateEmployeeRequest;
import com.kahraman.employeeRecords.business.responses.employees.GetEmployeeResponse;
import com.kahraman.employeeRecords.business.responses.employees.ListEmployeeResponse;
import com.kahraman.employeeRecords.dataAccess.abstracts.EmployeeRepository;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeManager(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;
	}

	@Override
	public void add(CreateEmployeeRequest createEmployeeRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UpdateEmployeeRequest updateEmployeeRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DeleteEmployeeRequest deleteEmployeeRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ListEmployeeResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetEmployeeResponse getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
