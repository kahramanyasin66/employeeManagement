package com.kahraman.employeeRecords.business.abstracts;

import java.util.List;

import com.kahraman.employeeRecords.business.requests.departments.CreateDepartmetRequest;
import com.kahraman.employeeRecords.business.requests.departments.DeleteDepartmetRequest;
import com.kahraman.employeeRecords.business.requests.departments.UpdateDepartmetRequest;
import com.kahraman.employeeRecords.business.responses.departments.GetDepartmentResponse;
import com.kahraman.employeeRecords.business.responses.departments.ListDepartmentResponse;

public interface DepartmentService {

	void add(CreateDepartmetRequest createDepartmetRequest);

	void update(UpdateDepartmetRequest updateDepartmetRequest);

	void delete(DeleteDepartmetRequest deleteDepartmetRequest);

	List<ListDepartmentResponse> getAll();

	GetDepartmentResponse getById(int id);

}
