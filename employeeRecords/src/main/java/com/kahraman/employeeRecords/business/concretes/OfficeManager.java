package com.kahraman.employeeRecords.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kahraman.employeeRecords.business.abstracts.OfficeService;
import com.kahraman.employeeRecords.business.requests.offices.CreateOfficeRequest;
import com.kahraman.employeeRecords.business.requests.offices.DeleteOfficeRequest;
import com.kahraman.employeeRecords.business.requests.offices.UpdateOfficeRequest;
import com.kahraman.employeeRecords.business.responses.offices.GetOfficeResponse;
import com.kahraman.employeeRecords.business.responses.offices.ListOfficeResponse;
import com.kahraman.employeeRecords.dataAccess.abstracts.OfficeRepository;

@Service
public class OfficeManager implements OfficeService {

	private OfficeRepository officeRepository;
    
	@Autowired
	public OfficeManager(OfficeRepository officeRepository) {

		this.officeRepository = officeRepository;
	}

	@Override
	public void add(CreateOfficeRequest createOfficeRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UpdateOfficeRequest updateOfficeRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DeleteOfficeRequest deleteOfficeRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ListOfficeResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetOfficeResponse getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
