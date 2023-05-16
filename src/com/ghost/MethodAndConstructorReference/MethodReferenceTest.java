package com.ghost.MethodAndConstructorReference;

public class MethodReferenceTest {
	
	public static void m2() {
		System.out.println("This is method reference example");
	}
	
	public static void main(String[] args) {
		
		//Alternative For Lambda Expression.
		//M1 is functional interface method.
		//M1 referes M2 method internally.
		//Arguments must same.here is no arguments in both method
		Interf i = MethodReferenceTest::m2;
		i.m1();
		
		
		
	}

}
