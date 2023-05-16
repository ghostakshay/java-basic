package com.ghost.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Ghost");
		employee.setSalary(50000.0);

		EmployeeSalaryInvocationHandler employeeHandler =
				new EmployeeSalaryInvocationHandler(employee);
		
		//Create Proxy Object.
		IEmployee employeeProxyInstance = (IEmployee)Proxy.newProxyInstance(Employee.class.getClassLoader(), 
				new Class[] {IEmployee.class}, employeeHandler);
		employeeProxyInstance.getHike(5000.0);
		//employeeProxyInstance.te
		System.out.println(employeeProxyInstance.getSalary());
	}
}
