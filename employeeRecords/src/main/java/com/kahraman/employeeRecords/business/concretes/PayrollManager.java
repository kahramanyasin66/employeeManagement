package com.kahraman.employeeRecords.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kahraman.employeeRecords.business.abstracts.PayrollService;
import com.kahraman.employeeRecords.business.requests.payrolls.CreatePayrollRequest;
import com.kahraman.employeeRecords.business.requests.payrolls.DeletePayrollRequest;
import com.kahraman.employeeRecords.business.requests.payrolls.UpdatePayrollRequest;
import com.kahraman.employeeRecords.business.responses.payrolls.GetPayrollResponse;
import com.kahraman.employeeRecords.business.responses.payrolls.ListPayrollResponse;
import com.kahraman.employeeRecords.dataAccess.abstracts.PayrollRepository;

@Service
public class PayrollManager implements PayrollService {

	private PayrollRepository payrollRepository;

	@Autowired
	public PayrollManager(PayrollRepository payrollRepository) {

		this.payrollRepository = payrollRepository;
	}

	@Override
	public void add(CreatePayrollRequest createPayrollRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UpdatePayrollRequest updatePayrollRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DeletePayrollRequest deletePayrollRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ListPayrollResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetPayrollResponse getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
