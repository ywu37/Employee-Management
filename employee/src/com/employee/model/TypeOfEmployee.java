package com.employee.model;

public enum TypeOfEmployee {
	full("full-time"), part("part-time"), intern("intern");

	private final String type;

	private TypeOfEmployee(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
