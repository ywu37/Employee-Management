package com.employee.model;

public class OrdinaryEmployee extends Employee {
	private int id;
	private String name;
	private int salary;
	private String typeOfEmployee;
	private String methodOfPay;

	public OrdinaryEmployee() {
	};

	public OrdinaryEmployee(String name, int salary) {
		this.setName(name);
		this.setSalary(salary);
		this.methodOfPay = MethodOfPay.byYear.getMethod();
		this.typeOfEmployee = TypeOfEmployee.full.getType();
	}

	@Override
	public String getTypeOfEmployee() {

		return TypeOfEmployee.full.getType();
	}

	@Override
	public String getMethodOfPay() {

		return MethodOfPay.byYear.getMethod();
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
