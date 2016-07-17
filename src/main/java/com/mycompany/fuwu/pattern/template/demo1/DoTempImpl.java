package com.mycompany.fuwu.pattern.template.demo1;

import com.alibaba.fastjson.JSON;


public class DoTempImpl extends DoTemp<GoodsDO> {
	
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
}
