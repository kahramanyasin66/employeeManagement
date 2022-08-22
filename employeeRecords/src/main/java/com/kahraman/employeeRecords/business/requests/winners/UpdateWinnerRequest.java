package com.kahraman.employeeRecords.business.requests.winners;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateWinnerRequest {

	private int id;
	
	private int employeeId;
	
}
