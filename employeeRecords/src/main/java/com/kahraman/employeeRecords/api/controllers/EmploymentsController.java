package com.kahraman.employeeRecords.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kahraman.employeeRecords.business.abstracts.EmploymentService;
import com.kahraman.employeeRecords.business.requests.employments.CreateEmploymentRequest;
import com.kahraman.employeeRecords.business.requests.employments.DeleteEmploymentRequest;
import com.kahraman.employeeRecords.business.requests.employments.UpdateEmploymentRequest;
import com.kahraman.employeeRecords.business.responses.employments.GetEmploymentResponse;
import com.kahraman.employeeRecords.business.responses.employments.ListEmploymentResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/employments")
public class EmploymentsController {

	private EmploymentService employmentService;

	@Autowired
	public EmploymentsController(EmploymentService employmentService) {

		this.employmentService = employmentService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateEmploymentRequest createEmploymentRequest) {
		this.employmentService.add(createEmploymentRequest);
	}

	@PostMapping("/update")
	public void update(@RequestBody UpdateEmploymentRequest updateEmploymentRequest) {
		this.employmentService.update(updateEmploymentRequest);
	}

	@PostMapping("/add")
	public void delete(@RequestBody DeleteEmploymentRequest deleteEmploymentRequest) {
		this.employmentService.delete(deleteEmploymentRequest);
	}

	@GetMapping("/getall")
	public List<ListEmploymentResponse> getAll() {
		return this.employmentService.getAll();
	}

	@GetMapping("/getbyid")
	public GetEmploymentResponse getById(@RequestParam int id) {
		return this.employmentService.getById(id);
	}

}
