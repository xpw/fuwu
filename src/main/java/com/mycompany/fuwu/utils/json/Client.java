package com.mycompany.fuwu.utils.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Client {

	public static void main(String[] args) {
		String js = JSON.toJSONString(initContentData());
		System.out.println(js);
		
		ContentData obj = JSON.parseObject(js, ContentData.class);
		System.out.println(obj);

		js = JSON.toJSONString(initContentData2());
		System.out.println(js);
		
		js = JSON.toJSONString(initContentData3());
		System.out.println(js);
	}

	static ContentData initContentData() {
		ContentData c = new ContentData();
		c.setContents(initContentRess());
		return c;
	}

	static ContentData2 initContentData2() {
		ContentData2 c = new ContentData2();
		c.setContents(initContentRes());
		return c;
	}
	
	static ContentData3 initContentData3() {
		ContentData3 c = new ContentData3();
		c.setContents(initContentRess().toArray(new ContentRes[initContentRess().size()]));
		return c;
	}

	static ContentRes initContentRes() {

		ContentRes c = new ContentRes();
		c.setData(initContentDOs());
		c.setMsg("msg");
		c.setSuccess(true);
		c.setTatal(100L);
		return c;
	}

	static List<ContentRes> initContentRess() {
		List<ContentRes> res = new ArrayList<ContentRes>();
		res.add(initContentRes());
		return res;
	}

	static List<ContentDO> initContentDOs() {
		List<ContentDO> res = new ArrayList<ContentDO>();
		for (int i = 0; i < 3; i++) {
			ContentDO c = new ContentDO();
			c.setId("id" + i);
			c.setTitle("title" + i);
			c.setUrl("url" + i);
			res.add(c);
		}
		return res;
	}
}
