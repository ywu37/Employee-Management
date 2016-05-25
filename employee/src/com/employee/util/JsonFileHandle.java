package com.employee.util;

import java.io.FileWriter;
import java.io.IOException;

import com.employee.dao.EmployeeDao;
import com.employee.model.*;
import com.google.gson.Gson;

public class JsonFileHandle {

	public void stroeEmployees(FileWriter writer) {
		EmployeeDao dao = new EmployeeDao();
		for (Employee iter : dao.getAllEmployees()) {
			Gson gson = new Gson();

			// convert java object to JSON format,
			// and returned as JSON formatted string
			String json = gson.toJson(iter);

			try {
				// write converted json data to a file named "test.json"
				writer.write(json);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Export existing employees to a JSON file successfully");
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}