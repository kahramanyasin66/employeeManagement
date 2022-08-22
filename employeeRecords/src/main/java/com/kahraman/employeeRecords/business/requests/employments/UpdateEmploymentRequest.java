package com.kahraman.employeeRecords.business.requests.employments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmploymentRequest {
	
	private int id;
	private String employmentName;

}
