package com.loginAndRegister;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<user> {

	@Override
	public user mapRow(ResultSet rs, int rowNum) throws SQLException {
		user un = new user();
		un.setUsername(rs.getString("username"));
		un.setPassword(rs.getString("password"));
		un.setEmail(rs.getString("email"));
		return un;
	}

}
