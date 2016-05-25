package com.employee.model;

public enum MethodOfPay {

	byYear("year"), byHour("hour");

	private final String method;

	private MethodOfPay(String method) {
		this.method = method;
	}

	public String getMethod() {
		return method;
	}

}
