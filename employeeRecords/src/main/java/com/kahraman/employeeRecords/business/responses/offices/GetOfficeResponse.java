package com.kahraman.employeeRecords.business.responses.offices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOfficeResponse {
	
	private String officeName;

	private String officePhone;

	private int addressId;

}
