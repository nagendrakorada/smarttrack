package com.dhanush.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dhanush.domain.EquipmentType;

public class FacilityRowMapper implements RowMapper<EquipmentType> {

	@Override
	public EquipmentType mapRow(ResultSet resultSet, int line) throws SQLException {
		FacilityExtractor facilityExtractor = new FacilityExtractor();
		return facilityExtractor.extractData(resultSet);
	}
}




























