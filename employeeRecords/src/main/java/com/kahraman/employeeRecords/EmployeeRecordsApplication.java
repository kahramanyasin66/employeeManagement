package com.kahraman.employeeRecords;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeRecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRecordsApplication.class, args);		
		
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}


}
