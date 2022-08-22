package com.kahraman.employeeRecords.business.requests.payrolls;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePayrollRequest {
	
    private LocalDate creatingDate;	

	private String registrationNumber;
	
	private double salary;
	
	private int employeeId;

}
