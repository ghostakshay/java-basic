package com.ghost.streamsFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByTest {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, 30, "Ghost30", "M"));
		studentList.add(new Student(1, 25, "Ghost25", "M"));
		studentList.add(new Student(1, 25, "Ghost26", "M"));
		studentList.add(new Student(1, 28, "Ghost28", "F"));
		studentList.add(new Student(1, 31, "Ghost31", "M"));
		studentList.add(new Student(1, 56, "Ghost56", "F"));

		// Find Out Student based on gender.
		Map<String, List<Student>> GenderMap = studentList.stream().collect(Collectors.groupingBy(Student::getGender));
		System.out.println(GenderMap);

		// Find Out COunt bases on GENDER
		Map<String, Long> genderCountMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println(genderCountMap);
	}

}
