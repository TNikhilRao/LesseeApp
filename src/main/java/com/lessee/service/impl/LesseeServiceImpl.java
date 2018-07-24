package com.lessee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lessee.dao.ILesseeDao;
import com.lessee.dto.LesseeDto;
import com.lessee.entity.Lessee;
import com.lessee.service.ILesseeService;
import com.lessee.util.ConversionUtil;

/**
 * @author Nikhil.Tirmanwar
 *
 */
@Service
public class LesseeServiceImpl implements ILesseeService {

	@Autowired
	ILesseeDao lesseeDao;

	@Override
	public LesseeDto getLessee(String lesseeId) {

		Lessee lessee = lesseeDao.findByLesseeId(lesseeId);
		LesseeDto dto = new LesseeDto();
		if (lessee != null) {
			dto = ConversionUtil.convertToLesseeDto(lessee);
		}

		return dto;
	}

	@Override
	public LesseeDto createLessee(LesseeDto dto) {

		Lessee lessee = new Lessee();
		lessee = ConversionUtil.convertToLessee(dto);
		Lessee insertedLessee = lesseeDao.save(lessee);
		LesseeDto insertedDto = ConversionUtil.convertToLesseeDto(insertedLessee);
		return insertedDto;
	}

}
