package com.ghost.finalTest;

import java.util.Collections;
import java.util.List;

public class Employee {

	final private int id;
	final String name;
	List<String> emailList;
	Long salary;
	private String gender;
	
	

	static int temp = 10;
	static {
		temp++;
	}

	static {
		++temp;
	}
	
	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, List<String> emailList, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.emailList = emailList;
		this.salary = salary;
	}

	{
		temp--;
	}
	public Employee(int id, String name, List<String> emailList) {
		super();
		this.id = id;
		this.name = name;
		this.emailList = emailList;
	}
	
	public Employee(int id, String name, List<String> emailList,String gender) {
		this(id,name,emailList);
		this.gender=gender;
	}

	public int getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public List<String> getEmailList() {
		return Collections.unmodifiableList(emailList);
	}

	public static void main(String[] args) {
		/*ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("test#gmail.com");
		Employee e = new Employee(1, "Ghost", arrayList);
		e.getEmailList().add("Tst");
		System.out.println(e.toString());*/
		
		Employee e = new Employee(1, "Ghost", null);
		Employee e1 = new Employee(1, "Ghost", null);
		Employee e2 = new Employee(1, "Ghost", null);
		System.out.println("Value of Temp -> {}"+temp);
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailList=" + emailList + ", salary=" + salary + "]";
	}

	

}
