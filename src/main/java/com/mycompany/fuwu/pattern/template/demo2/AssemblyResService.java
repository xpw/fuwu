package com.mycompany.fuwu.pattern.template.demo2;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface AssemblyResService<T> {

	public T assemblyRes(ResultSet rs) throws SQLException;
}
