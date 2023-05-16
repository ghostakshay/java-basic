package com.ghost.finalTest;

import com.ghost.functionalInterfaceTest.ChildInterface;
import com.ghost.functionalInterfaceTest.ParentInterface;

public class Test implements ChildInterface {
	
	private Integer id;
	private final Integer age =20;
	
	Test(Integer id){
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		Test t =new Test(10);
		t.displaydefault();
		ParentInterface p = new Test(55);
		p.displaydefault();
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	/*
	public void displaydefault() {
		//ParentInterface.displaystatic();
		//displaydefault();
		System.out.println("display default method of Class");
	}*/
	
}
