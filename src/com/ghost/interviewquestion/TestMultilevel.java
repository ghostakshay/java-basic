package com.ghost.interviewquestion;

import java.util.HashMap;

import com.ghost.dynamicproxy.Employee;

public class TestMultilevel {
	
	public static void main(String[] args) {
		
		/*
		 * SecondLevel s = new SecondLevel(10, 11, 0); int a = s.a;
		 * System.out.println(a);
		 */
		
		Employee e = new Employee();
		e.setName("Aditi");
				
		HashMap<Employee, String> map = new HashMap<Employee, String>();
		 map.put(e,"India");
		 map.putIfAbsent(e,"India- Updated");
		//System.out.println(" ***"+value);
		//Hashcode - 100
		//hash function (100) - > Index - > 5 Bucket
		
		//Hashcode - 100
		// 5 ->
		
		
		//e.setName("Ghost");
		
		System.out.println(map.get(e));
		// Key Hashcode - 100
		// hash function(100) - > 5
		//Key .equla(
				
	}

}
