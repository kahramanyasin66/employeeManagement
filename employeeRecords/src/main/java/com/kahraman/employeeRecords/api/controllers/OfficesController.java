package com.kahraman.employeeRecords.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kahraman.employeeRecords.business.abstracts.OfficeService;
import com.kahraman.employeeRecords.business.requests.offices.CreateOfficeRequest;
import com.kahraman.employeeRecords.business.requests.offices.DeleteOfficeRequest;
import com.kahraman.employeeRecords.business.requests.offices.UpdateOfficeRequest;
import com.kahraman.employeeRecords.business.responses.offices.GetOfficeResponse;
import com.kahraman.employeeRecords.business.responses.offices.ListOfficeResponse;


@RestController
@RequestMapping("/api/offices")
public class OfficesController {

	private OfficeService officeService;

	@Autowired
	public OfficesController(OfficeService officeService) {
		this.officeService = officeService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateOfficeRequest createOfficeRequest) {
		this.officeService.add(createOfficeRequest);
	}

	@PostMapping("/update")
	public void update(@RequestBody UpdateOfficeRequest updateOfficeRequest) {
		this.officeService.update(updateOfficeRequest);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody DeleteOfficeRequest deleteOfficeRequest) {
		this.officeService.delete(deleteOfficeRequest);
	}

	@GetMapping("/getall")
	public List<ListOfficeResponse> getAll() {
		return this.officeService.getAll();
	}

	@GetMapping("/getbyid")
	public GetOfficeResponse getById(@RequestParam int id) {
		return this.officeService.getById(id);
	}

}
