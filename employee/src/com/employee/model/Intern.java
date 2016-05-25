package com.employee.model;

public class Intern extends Employee {

	private int id;
	private String name;
	private int salary;
	private String typeOfEmployee;
	private String methodOfPay;
	public Intern() {};
	public Intern(String name, int salary) {
		this.setName(name);
		this.setSalary(salary);
		this.methodOfPay=MethodOfPay.byHour.getMethod();
		this.typeOfEmployee=TypeOfEmployee.part.getType();
	}
	@Override
	public String getTypeOfEmployee() {
		
		return TypeOfEmployee.part.getType();
	}

	@Override
	public String getMethodOfPay() {
		
		return MethodOfPay.byHour.getMethod();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
