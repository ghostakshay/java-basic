package com.ghost.streamsFilter;

import java.util.HashMap;
import java.util.Map;

public class Student {

	private int id;
	private int age;
	private String name;
	private String gender;

	public Student(int id, int age, String name, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {

		/*
		 * Map<Student, String> map = new HashMap<Student, String>(); Student student =
		 * new Student(1, 32, "Ghost", ""); Student student1 = new Student(1, 32,
		 * "Ghost", ""); System.out.println("****"+student.hashCode());
		 * System.out.println(student1.hashCode()); map.put(student, "GHOST1");
		 * student.setAge(3355555); System.out.println("****"+student.hashCode());
		 * //map.put(student1, "GHOST2"); System.out.println(map.size());
		 * System.out.println(map.get(student1));
		 */
		
		int hours = 10 / 60; //since both are ints, you get an int
		int minutes = 10 % 60;
		System.out.printf("%d:%02d", hours, minutes);
	}

}
