package com.kahraman.employeeRecords.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kahraman.employeeRecords.business.abstracts.DepartmentService;
import com.kahraman.employeeRecords.business.requests.departments.CreateDepartmetRequest;
import com.kahraman.employeeRecords.business.requests.departments.DeleteDepartmetRequest;
import com.kahraman.employeeRecords.business.requests.departments.UpdateDepartmetRequest;
import com.kahraman.employeeRecords.business.responses.departments.GetDepartmentResponse;
import com.kahraman.employeeRecords.business.responses.departments.ListDepartmentResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {

	private DepartmentService departmentService;

	@Autowired
	public DepartmentsController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateDepartmetRequest createDepartmetRequest) {
		this.departmentService.add(createDepartmetRequest);
	}

	@PostMapping("/update")
	public void update(@RequestBody UpdateDepartmetRequest updateDepartmetRequest) {
		this.departmentService.update(updateDepartmetRequest);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody DeleteDepartmetRequest deleteDepartmetRequest) {
		this.departmentService.delete(deleteDepartmetRequest);
	}

	@GetMapping("/getall")
	public List<ListDepartmentResponse> getAll() {
		return this.departmentService.getAll();
	}

	@GetMapping("/getbyid")
	public GetDepartmentResponse getById(@RequestParam int id) {
		return this.departmentService.getById(id);
	}

}
