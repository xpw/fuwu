package com.mycompany.fuwu.utils.json;

public class Stu {
	private int id;
	private String name;

	Stu() {

	}

	Stu(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
