package com.employee.test;

import java.io.FileWriter;
import java.io.IOException;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;
import com.employee.model.Intern;
import com.employee.model.Manager;
import com.employee.model.OrdinaryEmployee;
import com.employee.util.JsonFileHandle;

public class DaoTest {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();

		// Add new employee
		Employee employee = new Manager("wu", 6666);
		Employee intern = new Intern("yuan", 66);
		Employee ordinaryEmployee = new OrdinaryEmployee("yuanwu", 3000);
		dao.addEmployee(employee);
		dao.addEmployee(intern);
		dao.addEmployee(ordinaryEmployee);
		//
		// // Update employee
		employee.setSalary(9000);
		dao.updateEmployee(employee);

		// Delete employee
		// dao.deleteEmployee(1);
		//
		// Get all employees
		for (Employee iter : dao.getAllEmployees()) {
			System.out.println(iter);
		}

		// export existing employees to a JSON file
		FileWriter writer = null;
		try {
			writer = new FileWriter("/Users/wuyuan/Desktop/test.json");
		} catch (IOException e) {

			e.printStackTrace();
		}
		JsonFileHandle handle = new JsonFileHandle();
		handle.stroeEmployees(writer);
	}

}