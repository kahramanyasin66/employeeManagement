package com.kahraman.employeeRecords.business.requests.employees;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeRequest {

	private String firstName;

	private String lastName;

	private String identityNumber;

	private String email;

	private LocalDate birthDate;

	private int addressId;

	private int departmentId;

	private int employmentId;

}
