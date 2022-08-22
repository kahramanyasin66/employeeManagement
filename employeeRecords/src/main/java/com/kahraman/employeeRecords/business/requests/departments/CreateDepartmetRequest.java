package com.kahraman.employeeRecords.business.requests.departments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class CreateDepartmetRequest {
	
	private String departmentName;	
	
	private String departmentNumber;

	private int officeId;

}
