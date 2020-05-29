package com.example.log.enums;

public enum ResultEnum {
	SUCCESS("success"),
	UNKNOW_ERROR("未知异常"),
	INSERT_FAIL("插入失败"),
	PARAM_ERROR("参数失败"),
	A("");
	private String msg;
	private ResultEnum(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "{\"msg\":\""+this.msg+"\"}";
	}
}
