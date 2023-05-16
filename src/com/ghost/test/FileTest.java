package com.ghost.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ghost.finalTest.Employee;

public class FileTest {
	
	public static void main(String[] args) throws IOException {
	
	 
	 File file = new File("F:\\Hibernate-Projects\\java-basics\\src\\com\\ghost\\test\\test.txt");
	 System.out.println(file.isDirectory());
	 System.out.println("Path "+file.getCanonicalPath().toString());
	 System.out.println("Path "+file.getAbsolutePath().toString());
		Employee e1 = new Employee(1, "Synerzip-Ghost", null,27000L);
		Employee e2 = new Employee(2, "Ghost-excellarate", null,24000L);
		Employee e3 = new Employee(3, "Ghost-HDFC", null,15000L);
		Employee e4 = new Employee(4, "ghost", null,29000L);

		ArrayList<Employee> emplist = new ArrayList<Employee>();

		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		//Increase salary of employee whose sal>25000L whose salary < 25000l
		emplist.stream().map(E -> {
			if (E.getSalary() > 25000L) {
				E.setSalary(E.getSalary() * 2L);
			}
			return E;
		}).collect(Collectors.toList()).forEach(System.out::println);
}
	
	

}
