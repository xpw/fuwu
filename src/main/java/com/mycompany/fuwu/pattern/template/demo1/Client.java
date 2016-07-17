package com.mycompany.fuwu.pattern.template.demo1;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Client {

	public static void main(String[] args) {
		
		
		test_dotemp();
	}
	
	public static void test_dotemp() {
		
		List<GoodsDO> target = new ArrayList<GoodsDO>();
		List<GoodsDO> orign = new ArrayList<GoodsDO>();
		for(int i = 1; i<3; i++) {
			GoodsDO p = new GoodsDO();
			p.setId(i);
			p.setName("ym" + i);
			target.add(p);
			
			p = new GoodsDO();
			p.setId(i - 1);
			p.setName("ym" + (i - 1));
			orign.add(p);
		}
		
//		new DoTempImpl().execute(target, orign);
		
		new DoTemp<GoodsDO>() {

			@Override
			public void insert(GoodsDO t) {
				// TODO Auto-generated method stub
				System.out.println("-------- insert ---------" + JSON.toJSONString(t));
			}

			@Override
			public void update(GoodsDO target, GoodsDO orign) {
				// TODO Auto-generated method stub
				System.out.println("-------- update ---------" + JSON.toJSONString(target) + "---- 更新后值为 ----" + JSON.toJSONString( orign));
			}

			@Override
			public void delete(GoodsDO t) {
				// TODO Auto-generated method stub
				System.out.println("-------- delete ---------" + JSON.toJSONString(t));
			}
		}.execute(target, orign);
	}
	
	private static void test_extends() {
		GoodsDO p = new GoodsDO(1, "ym");
		System.out.println(p);
	}
	
}
