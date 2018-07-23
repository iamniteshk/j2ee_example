package com.training.jsonexample.custominstance;

import java.lang.reflect.Type;

import com.google.gson.InstanceCreator;
import com.training.jsonexample.bean.Employee;

public class EmployeeCreator implements InstanceCreator<Employee> {

	public Employee createInstance(Type type) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setSalary(50000);
		return emp;
	}

}
