package com.employee.model;
public class Employee implements EmployeeInterface {
	private transient int id;
	private transient String name;
	private transient int salary;
	private transient String typeOfEmployee;
	private transient String methodOfPay;

	@Override
	public String getTypeOfEmployee() {

		return null;
	}

	@Override
	public String getMethodOfPay() {

		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return 0;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}

	public void setMethodOfPay(String methodOfPay) {
		this.methodOfPay = methodOfPay;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", typeOfEmployee=" + typeOfEmployee
				+ ", methodOfPay=" + methodOfPay + "]";
	}

	
}
