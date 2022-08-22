package com.kahraman.employeeRecords.business.responses.departments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListDepartmentResponse {
	
	private String departmentName;	
	
	private String departmentNumber;

	private int officeId;

}
