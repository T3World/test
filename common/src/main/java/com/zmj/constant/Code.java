package com.zmj.constant;

public enum Code {
	OK("2000"),
	PARAM_ERROR("2001"),
	BUSINESS_ERROR("4000"),
	DB_ERROR("5000");
	
	private String value;
	
	private Code(String value) {
		this.value = value;
	}

	
	public String getValue() {
		return value;
	}


	@Override
	public String toString() {
		return this.value;
	}
	
	
}
