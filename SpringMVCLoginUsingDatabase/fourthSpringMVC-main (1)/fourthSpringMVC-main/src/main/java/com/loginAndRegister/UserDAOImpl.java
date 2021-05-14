package com.loginAndRegister;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbc = new JdbcTemplate(getDataSource());

	public void insert(user u) {

		String sql = "INSERT INTO user VALUES (?,?,?)";
		Object[] arg = { u.getUsername(), u.getEmail(), u.getPassword() };
		jdbc.update(sql, arg);

	}

	public boolean findUser(String username, String password) {

		String sql = "Select * FROM user";
		List<user> n = (List<user>) jdbc.query(sql, new UserRowMapper());
		System.out.println(username + " " + password);
		for (user r : n) {
			System.out.println(r.toString());
			if (r.getUsername().matches(username) && r.getPassword().matches(password))
				return true;
		}
		return false;

	}

	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/details";
		String username = "root";
		String password = "nkss2010";
		DataSource dataSource = new DriverManagerDataSource(url, username, password);
		return dataSource;
	}

}
