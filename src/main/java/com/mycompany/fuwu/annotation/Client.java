package com.mycompany.fuwu.annotation;

import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args) {
		Method[] methods = AnnotationDemo.class.getMethods();
		for(Method m : methods) {
			if(m.isAnnotationPresent(MyMethodAnnotation.class)) {
				System.out.println("----- " + m.getName() + " -------");
			}
		}
		
		if(AnnotationDemo.class.isAnnotationPresent(MyClassAnnotation.class)) {
			System.out.println("AnnotationDemo is MyClassAnnotation");
		}
		

		if(AnnotationDemo.class.isAnnotationPresent(MyClassAnnotation2.class)) {
			System.out.println("AnnotationDemo is MyClassAnnotation2");
		}
	}
}
