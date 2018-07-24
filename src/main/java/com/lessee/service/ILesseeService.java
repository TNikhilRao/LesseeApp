package com.lessee.service;

import org.springframework.stereotype.Service;

import com.lessee.dto.LesseeDto;

/**
 * @author Nikhil.Tirmanwar
 *
 */
@Service
public interface ILesseeService {

	public LesseeDto getLessee(String lesseeId);
	
	public LesseeDto createLessee(LesseeDto dto);

}
