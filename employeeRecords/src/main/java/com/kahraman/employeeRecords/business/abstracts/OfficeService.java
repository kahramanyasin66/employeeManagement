package com.kahraman.employeeRecords.business.abstracts;

import java.util.List;

import com.kahraman.employeeRecords.business.requests.offices.CreateOfficeRequest;
import com.kahraman.employeeRecords.business.requests.offices.DeleteOfficeRequest;
import com.kahraman.employeeRecords.business.requests.offices.UpdateOfficeRequest;
import com.kahraman.employeeRecords.business.responses.offices.GetOfficeResponse;
import com.kahraman.employeeRecords.business.responses.offices.ListOfficeResponse;

public interface OfficeService {
	
	void add(CreateOfficeRequest createOfficeRequest);

	void update(UpdateOfficeRequest updateOfficeRequest);

	void delete(DeleteOfficeRequest deleteOfficeRequest);

	List<ListOfficeResponse> getAll();

	GetOfficeResponse getById(int id);

}
