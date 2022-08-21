package com.kahraman.employeeRecords.business.abstracts;

import java.util.List;

import com.kahraman.employeeRecords.business.requests.payrolls.CreatePayrollRequest;
import com.kahraman.employeeRecords.business.requests.payrolls.DeletePayrollRequest;
import com.kahraman.employeeRecords.business.requests.payrolls.UpdatePayrollRequest;
import com.kahraman.employeeRecords.business.responses.payrolls.GetPayrollResponse;
import com.kahraman.employeeRecords.business.responses.payrolls.ListPayrollResponse;

public interface PayrollService {
	
	void add(CreatePayrollRequest createPayrollRequest);

	void update(UpdatePayrollRequest updatePayrollRequest);

	void delete(DeletePayrollRequest deletePayrollRequest);

	List<ListPayrollResponse> getAll();

	GetPayrollResponse getById(int id);
}
