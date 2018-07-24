package com.lessee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lessee.dto.LesseeDto;
import com.lessee.service.ILesseeService;

/**
 * @author Nikhil.Tirmanwar
 *
 */
@RestController
@RequestMapping(value = "/lessee")
public class LesseeController {

	@Autowired
	ILesseeService lesseeService;

	private static final Logger logger = LoggerFactory.getLogger(LesseeController.class);

	@GetMapping(value = "/{id}")
	public ResponseEntity<LesseeDto> getLessee(@PathVariable("id") String lesseeId) {

		logger.debug("getLessee started for lesseeId:: {} \t", lesseeId);
		LesseeDto responseDto = new LesseeDto();

		responseDto = lesseeService.getLessee(lesseeId);

		return new ResponseEntity<LesseeDto>(responseDto, HttpStatus.OK);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LesseeDto> createLessee(@RequestBody LesseeDto dto) {

		LesseeDto responseDto = lesseeService.createLessee(dto);

		return new ResponseEntity<LesseeDto>(responseDto, HttpStatus.CREATED);
	}

}
