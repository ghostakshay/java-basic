package com.ghost.streamsFilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, 30, "Ghost30", "M"));
		studentList.add(new Student(1, 25, "Ghost25", "M"));
		studentList.add(new Student(1, 25, "Ghost26", "M"));
		studentList.add(new Student(1, 28, "Ghost28", "F"));
		studentList.add(new Student(1, 31, "Ghost31", "M"));
		studentList.add(new Student(1, 56, "Ghost56", "F"));

		// Sort on Age
		// studentList.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);

		// Sort on Age,Name
		studentList.stream()
				.sorted(Comparator.comparing(Student::getAge).thenComparing(Comparator.comparing(Student::getName)))
				.forEach(System.out::println);
		
		System.out.println("***************************");
		//Sort on Age Desc
		List<Student> collect = studentList.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
		System.out.println(collect);

		System.out.println("***************************");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(7);
		list.add(0);

		// Sort on Asc order.
		list.stream().sorted().forEach(System.out::println);

		System.out.println("***************************");
		
		// Sort on Desc order.
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
