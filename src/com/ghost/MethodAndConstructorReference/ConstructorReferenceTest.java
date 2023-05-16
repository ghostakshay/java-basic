package com.ghost.MethodAndConstructorReference;

public class ConstructorReferenceTest {
	
	public static void main(String[] args) {
		
		//ConstructorReference syntax
		//Classname::new
		ConstructorReferenceInterface c = ConstructorReference::new;
		System.out.println(c.get().toString());
		
		//With Lambda expression
		ConstructorReferenceInterface lc = () -> {
			ConstructorReference  obj = new ConstructorReference();
			return obj;
			
		};
		System.out.println(lc.get());
	}

}
