package com.mycompany.fuwu.javase.interfacedemo;

public class InterfaceDemo implements InterfaceA {
	
	public static void main(String[] args) {
		InterfaceA a = new InterfaceDemo();
		a.say(new InterfaceB() {
			
			@Override
			public void say() {
				System.out.println("B");
			}
		});
		
	}

	@Override
	public void say(InterfaceB b) {
		System.out.println("A");
	}

}
