package com.mycompany.fuwu.utils.json;

import com.alibaba.fastjson.JSON;

public class User {
	
	private Stu[] stu;
	
	public Stu[] getStu() {
		return stu;
	}

	public void setStu(Stu[] stu) {
		this.stu = stu;
	}
	
	public static void main(String[] args) {
		User u = new User();
		
		
		Stu[] stus = new Stu[2];
		
		for(int i = 0; i<2; i++) {
			Stu s = new Stu(1, "name"+i);
			stus[i] = s;
		}
		
		u.setStu(stus );
		
		String js = JSON.toJSONString(u);
		System.out.println(js);
	}
	
}

