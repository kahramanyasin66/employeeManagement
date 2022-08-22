package com.kahraman.employeeRecords.core.mapping;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper  forResponse();
	ModelMapper forRequest();	
	

}
