package com.mycompany.fuwu.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class ArraysDemo {

	public static void main(String[] args) {
		convertArray2List();
		convertList2Array();
	}
	
	static void convertArray2List() {
		String[] strs = new String[]{"hehe","haha","heihei"};
		List<String> list = Arrays.asList(strs);
		
		System.out.println(JSON.toJSONString(list));
	}
	
	static void convertList2Array() {
		List<String> list = new ArrayList<String>();
		list.add("hehe");
		list.add("haha");
		list.add("heihei");
		String[] strs =  list.toArray(new String[]{});
		
		System.out.println(JSON.toJSONString(strs));
	}
}
