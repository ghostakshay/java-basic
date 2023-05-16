package com.ghost.interviewquestion;

public class Child extends Parent {

	
	public Child() {
		System.out.println("In Child Constructor...");
	}

	@Override
	public void display() {
		System.out.println("Child");
	}
	/*
	public void test() {
		System.out.println("Static Test Child");
	}*/
	
	public void test1() {
		System.out.println( "Test1 Child");
	}

	public static void main(String[] args) {

		Parent p = new Child();
		p.display();
		p.test();
		Child c = new Child();
		c.display();
	}
}
