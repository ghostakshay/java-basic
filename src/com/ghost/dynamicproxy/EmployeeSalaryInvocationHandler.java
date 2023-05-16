package com.ghost.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {
	
	private IEmployee employeeTarget;
	
	public EmployeeSalaryInvocationHandler(IEmployee employeeTarget) {
		super();
		this.employeeTarget = employeeTarget;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// Pre Handle
		if (method.getName().equals("getHike")) {
			double amount = (double) args[0];
			if (amount < 0) {
				throw new RuntimeException("AMount shouble be greater than 0");
			}
		}

		// Handle
		Object result = method.invoke(employeeTarget, args);

		// Post andle
		return result;
	}

}
