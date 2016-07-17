package com.mycompany.fuwu.javase.interfacedemo;

public interface InterfaceA {

	public void say(InterfaceB b);
	
	public interface InterfaceB {
		public void say();
	}
}
