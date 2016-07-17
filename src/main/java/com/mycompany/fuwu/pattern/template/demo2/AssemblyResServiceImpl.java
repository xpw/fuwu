package com.mycompany.fuwu.pattern.template.demo2;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mycompany.fuwu.pattern.template.Person;

public class AssemblyResServiceImpl implements AssemblyResService<Person> {

	@Override
	public Person assemblyRes(ResultSet rs) throws SQLException {
		return new Person(rs.getInt("id"), rs.getString("name"));
	}
}
