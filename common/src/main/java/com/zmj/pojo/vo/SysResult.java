package com.zmj.pojo.vo;

import java.io.Serializable;

public class SysResult implements Serializable{

	private static final long serialVersionUID = 1L;

	private String code;
	
	private String msg;
	
	private Object data;
	
	

	public SysResult() {
		super();
	}

	public SysResult(String code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
