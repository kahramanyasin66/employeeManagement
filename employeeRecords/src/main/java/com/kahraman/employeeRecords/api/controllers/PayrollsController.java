package com.kahraman.employeeRecords.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kahraman.employeeRecords.business.abstracts.PayrollService;
import com.kahraman.employeeRecords.business.requests.payrolls.CreatePayrollRequest;
import com.kahraman.employeeRecords.business.requests.payrolls.DeletePayrollRequest;
import com.kahraman.employeeRecords.business.requests.payrolls.UpdatePayrollRequest;
import com.kahraman.employeeRecords.business.responses.payrolls.GetPayrollResponse;
import com.kahraman.employeeRecords.business.responses.payrolls.ListPayrollResponse;



@RestController
@RequestMapping("/api/payrolls")
public class PayrollsController {

	private PayrollService payrollService;

	@Autowired
	public PayrollsController(PayrollService payrollService) {

		this.payrollService = payrollService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreatePayrollRequest createPayrollRequest) {
		this.payrollService.add(createPayrollRequest);
	}

	@PostMapping("/update")
	public void update(@RequestBody UpdatePayrollRequest updatePayrollRequest) {
		this.payrollService.update(updatePayrollRequest);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody DeletePayrollRequest deletePayrollRequest) {
		this.payrollService.delete(deletePayrollRequest);
	}

	@GetMapping("/getall")
	public List<ListPayrollResponse> getAll() {
		return this.payrollService.getAll();
	}

	@GetMapping("/getbyid")
	public GetPayrollResponse getById(@RequestParam int id) {
		return this.payrollService.getById(id);
	}

}
