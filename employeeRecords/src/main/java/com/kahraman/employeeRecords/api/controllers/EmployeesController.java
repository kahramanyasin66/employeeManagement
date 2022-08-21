package com.kahraman.employeeRecords.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kahraman.employeeRecords.business.abstracts.EmployeeService;
import com.kahraman.employeeRecords.business.requests.employees.CreateEmployeeRequest;
import com.kahraman.employeeRecords.business.requests.employees.DeleteEmployeeRequest;
import com.kahraman.employeeRecords.business.requests.employees.UpdateEmployeeRequest;
import com.kahraman.employeeRecords.business.responses.employees.GetEmployeeResponse;
import com.kahraman.employeeRecords.business.responses.employees.ListEmployeeResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {

		this.employeeService = employeeService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
		this.employeeService.add(createEmployeeRequest);
	}

	@PostMapping("/update")
	public void update(UpdateEmployeeRequest updateEmployeeRequest) {
		this.employeeService.update(updateEmployeeRequest);
	}

	@PostMapping("/delete")
	public void delete(DeleteEmployeeRequest deleteEmployeeRequest) {
		this.employeeService.delete(deleteEmployeeRequest);
	}

	@GetMapping("/getall")
	public List<ListEmployeeResponse> getAll() {
		return this.employeeService.getAll();
	}

	@GetMapping("/getbyid")
	public GetEmployeeResponse getById(@RequestParam int id) {
		return this.employeeService.getById(id);
	}

}
