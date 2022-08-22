package com.kahraman.employeeRecords.business.responses.works;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListWorkResponse {

	private LocalDate startedDate;

	private LocalDate dueDate;

	private int employeeId;

}
