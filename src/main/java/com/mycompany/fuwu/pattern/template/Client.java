package com.mycompany.fuwu.pattern.template;

import java.sql.SQLException;

import com.mycompany.fuwu.pattern.template.demo2.NewTemp;

public class Client {

	public static void main(String[] args) throws SQLException {
//		Temp.getPersonListByName("xpw");
//		Temp.getPersonById(1);
//		NewTemp.getPersonListByName("xpw");
		NewTemp.getPersonById(1);
	}
}
