package com.lessee.util;

import com.lessee.dto.LesseeDto;
import com.lessee.entity.Lessee;

/**
 * @author Nikhil.Tirmanwar
 *
 */
public class ConversionUtil {

	public static LesseeDto convertToLesseeDto(Lessee lessee) {
		LesseeDto dto = new LesseeDto();
		dto.setId(lessee.getId());
		dto.setLesseeId(lessee.getLesseeId());
		dto.setLesseeName(lessee.getLesseeName());
		dto.setLesseeLocation(lessee.getLesseeLocation());
		return dto;
	}

	public static Lessee convertToLessee(LesseeDto dto) {
		Lessee lessee = new Lessee();
		lessee.setId(dto.getId());
		lessee.setLesseeId(dto.getLesseeId());
		lessee.setLesseeName(dto.getLesseeName());
		lessee.setLesseeLocation(dto.getLesseeLocation());

		return lessee;
	}

}
