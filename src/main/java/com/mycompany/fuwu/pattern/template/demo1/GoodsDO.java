package com.mycompany.fuwu.pattern.template.demo1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class GoodsDO extends BaseDO {

	private int id;
	
	private String name;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public GoodsDO() {

	}

	public GoodsDO(int id, String name) {
		this.id = id;
		this.name = name;
		super.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
