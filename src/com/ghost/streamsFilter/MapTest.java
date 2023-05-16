package com.ghost.streamsFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ghost.finalTest.Employee;

public class MapTest {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(3);
		list.add(6);
		list.add(11);
		list.add(16);

		ArrayList<Integer> list1 = (ArrayList<Integer>) list.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println(list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Test");
		list2.add("Strwamns");
		list2.add("mapTest");
		list2.add("GhostMan");
		list2.add("GhostRider");

		// Convert each obj to upparcase ArrayList<String> list3 =
		/*
		 * (ArrayList<String>) list2.stream().map(S -> S.toUpperCase())
		 * .collect(Collectors.toList()); System.out.println(list3);
		 */

		List<String> collect = list2.stream().filter(S -> S.length() > 5).map(S -> S.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("***** " + collect);

		List<String> collect2 = list2.stream().filter(S -> S.length() > 5).map(S -> S.concat("  Updated"))
				.collect(Collectors.toList());
		System.out.println(collect2);

		ArrayList<String> emailIdList = new ArrayList<String>();
		emailIdList.add("tst@gmail.com");
		emailIdList.add("tst1@gmail.com");
		emailIdList.add("tst@2gmail.com");

		ArrayList<String> emailIdList1 = new ArrayList<String>();
		emailIdList1.add("tst@gmaifffdfsl.com");

		Employee e1 = new Employee(1, "Test", emailIdList, "Male");
		Employee e2 = new Employee(1, "Test", emailIdList1, "Male");
		Employee e3 = new Employee(3, "Test", emailIdList, "Female");

		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);

		Map<String, List<Employee>> collect1 = emplist.stream().collect(Collectors.groupingBy(Employee::getGender));

		System.out.println(collect1);
		// Convert to Map<Integer,List<String>)
		Map<Integer, List<String>> Map = emplist.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getEmailList, (oldValue, newValue) -> newValue));

		Map.forEach((K, V) -> System.out.println(K + " " + V));

		// Map with gender separation.
		java.util.Map<String, Long> genderMap = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderMap);

	}
}
