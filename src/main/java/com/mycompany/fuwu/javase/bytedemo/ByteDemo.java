package com.mycompany.fuwu.javase.bytedemo;

import java.io.UnsupportedEncodingException;

public class ByteDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// ���н����2
		System.out.println("����".getBytes("ISO8859-1").length);
		// ���н����4
		System.out.println("����".getBytes("GB2312").length);
		// ���н����4
		System.out.println("����".getBytes("GBK").length);
		// ���н����6
		System.out.println("����".getBytes("UTF-8").length);
	}
}
