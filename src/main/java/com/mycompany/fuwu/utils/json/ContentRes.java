package com.mycompany.fuwu.utils.json;

import java.util.List;

public class ContentRes {

	private boolean success;

	private String msg;

	private Long tatal;

	private List<ContentDO> data;

	public boolean isSuccess() {
		return success;
	}

	public String getMsg() {
		return msg;
	}

	public Long getTatal() {
		return tatal;
	}

	public List<ContentDO> getData() {
		return data;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setTatal(Long tatal) {
		this.tatal = tatal;
	}

	public void setData(List<ContentDO> data) {
		this.data = data;
	}

}
