package com.mycompany.fuwu.javase.bytedemo;

import java.io.UnsupportedEncodingException;

public class ByteDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// 运行结果：2
		System.out.println("测试".getBytes("ISO8859-1").length);
		// 运行结果：4
		System.out.println("测试".getBytes("GB2312").length);
		// 运行结果：4
		System.out.println("测试".getBytes("GBK").length);
		// 运行结果：6
		System.out.println("测试".getBytes("UTF-8").length);
	}
}
