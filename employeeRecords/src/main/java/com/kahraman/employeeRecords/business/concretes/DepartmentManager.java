package com.kahraman.employeeRecords.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kahraman.employeeRecords.business.abstracts.DepartmentService;
import com.kahraman.employeeRecords.business.requests.departments.CreateDepartmetRequest;
import com.kahraman.employeeRecords.business.requests.departments.DeleteDepartmetRequest;
import com.kahraman.employeeRecords.business.requests.departments.UpdateDepartmetRequest;
import com.kahraman.employeeRecords.business.responses.departments.GetDepartmentResponse;
import com.kahraman.employeeRecords.business.responses.departments.ListDepartmentResponse;
import com.kahraman.employeeRecords.dataAccess.abstracts.DepartmentRepository;

@Service
public class DepartmentManager implements DepartmentService {

	private DepartmentRepository departmentRepository;

	@Autowired
	public DepartmentManager(DepartmentRepository departmentRepository) {

		this.departmentRepository = departmentRepository;
	}

	@Override
	public void add(CreateDepartmetRequest createDepartmetRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UpdateDepartmetRequest updateDepartmetRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DeleteDepartmetRequest deleteDepartmetRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ListDepartmentResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetDepartmentResponse getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
