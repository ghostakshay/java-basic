package com.ghost.implementationTest;

import com.ghost.functionalInterfaceTest.ParentInterface;

public class MyImplementation implements ParentInterface {
	
	public static void display() {
		System.out.println("Static Method from Class");
	}
	public static void main(String[] args) {
		
		ParentInterface.displaystatic();
		ParentInterface m = new MyImplementation();
		m.displaydefault();
	/*************************************************************/	
		ParentInterface p = () -> {
			System.out.println("Demo From lambda");
		};
		p.demo();
	/*************************************************************/
		
	/*********************SQURE TEST BEGIN****************************************/
		SquareInterface s = n -> n*n;
		System.out.println("Square "+s.square(10));
	/*********************SQURE TEST END***************************************/
	}
	@Override
	public void demo() {
		System.out.println("Static Method from Class");
	}
	
	/*
	public void displaydefault() {
	      System.out.println("default method of MyImplementation");
	   }*/
	
	
	
}
