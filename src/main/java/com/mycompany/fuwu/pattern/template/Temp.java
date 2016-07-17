package com.mycompany.fuwu.pattern.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Temp {

	static final String DB_URL = "jdbc:mysql://localhost/testdb";
	static final String USER = "root";
	static final String PWD = "root";

	private static Connection connection = null;

	static {
		try {
			// 注册JDBC驱动程序：以打开与数据库的通信信道
			Class.forName("com.mysql.jdbc.Driver");
			// 获取连接
			connection = DriverManager.getConnection(DB_URL, USER, PWD);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("ClassNotFoundException");
		} catch (SQLException e) {
			throw new RuntimeException("SQLException");
		}
	}

	public static List<Person> getPersonListByName(String name) {
		List<Person> res = new ArrayList<Person>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from person where name = ?";
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				res.add(new Person(rs.getInt("id"), rs.getString("name")));
			}
			return res;
		} catch (SQLException e) {

		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {

				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {

				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {

				}
			}
		}
		return null;
	}

	public static List<Person> getPersonById(int id) {
		List<Person> res = new ArrayList<Person>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from person where id = ?";
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				res.add(new Person(rs.getInt("id"), rs.getString("name")));
			}
			return res;
		} catch (SQLException e) {

		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {

				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {

				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {

				}
			}
		}
		return null;
	}
}
