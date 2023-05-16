package com.ghost.streamsFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, 30, "Ghost30", "M"));
		studentList.add(new Student(1, 25, "Ghost25", "M"));
		studentList.add(new Student(1, 28, "Ghost28", "F"));
		studentList.add(new Student(1, 31, "Ghost31", "M"));
		studentList.add(new Student(1, 56, "Ghost56", "F"));

		// Find out student whose age > 30

		List<Student> ageList = studentList.stream().filter(s -> s.getAge() > 30).collect(Collectors.toList());
		System.out.println(ageList);

		// Find out student name whose age > 30
		List<String> nameList = studentList.stream().filter(s -> s.getAge() >= 30).map(s -> s.getName())
				.collect(Collectors.toList());

		// Add 5 to each age of employee
		// MAP = Method used to Perform operation on each object.
		List<Integer> ageAddList = studentList.stream().map(S -> S.getAge() + 5).collect(Collectors.toList());

		// Find Count of Student age <35
		long count = studentList.stream().filter(S -> S.getAge() < 35).count();
		System.out.println("Student Age<35 :" + count);

		// Find Out Student based on gender.
		Map<String, List<Student>> GenderMap = studentList.stream().collect(Collectors.groupingBy(Student::getGender));
		System.out.println(GenderMap);

		// Find Out COunt bases on GENDER
		Map<String, Long> genderCountMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println(genderCountMap);

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(7);
		list.add(0);
		
		Integer reduce = list.stream().reduce(0,Integer::sum);
		System.out.println("Sum "+reduce);
	}

}
