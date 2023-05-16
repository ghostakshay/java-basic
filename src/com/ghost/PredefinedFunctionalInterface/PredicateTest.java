package com.ghost.PredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

/**
 * 
 * @author akshayp
 * Predicate is Function PREDEFINED Functional Interface provided by JAVA
 * It has test method which return boolean value.
 * It mainly used where in conditional check.
 * Write Once use any time.
 *
 */
public class PredicateTest {
	
	public static void main(String[] args) {
		
	/*************Predicate to check Given Number even or not Start************/
		
		Predicate<Integer> p1 = I -> I%2==0;
		System.out.println(p1.test(10));
		
	/*************Predicate to check Given Number even or not End************/
		
	/****Predicate to check String Length greater than 5 in array and print***************/
		
	String[] strarray = { "Ghost", "Akshay", "Pansare", "ASD", "INDIA25" };

	Predicate<String> p2 = S -> S.length() > 5;

	for (String string : strarray) {

		if (p2.test(string)) {
			System.out.println(string);
		}

	}
	/****Predicate to check String Length greater than 5 in array and print***************/
	
	/***Predicate Joining***/
	//Check number in array is even and it is greater than 5
	Integer[] x = {0,45,20,32,33,17,8,102};
	
	//Predicate to find out even number
	Predicate<Integer> p3 = I-> I%2==0;
	
	//Predicate to find out number > 5
	Predicate<Integer> p4 = I-> I>5;
	
	//Predicate combine
	Predicate<Integer> p5 = I -> I%2==0 && I>5;
	
	for (Integer integer : x) {
		
		if(p3.and(p4).test(integer)) {
			System.out.println(integer);
		}
		if(p5.test(integer)) {
			System.out.println(integer);
		}
	}
	
	Integer [] A = {1,2,1,3,5,3};
	int count = 0;
	 List<Integer> list = Arrays.asList(A);
	 ArrayList<Integer> l = new ArrayList<Integer>(list);
	 int j =0;
	 int k =0;
	 Iterator<Integer> iterator = l.iterator();
		while (iterator.hasNext()) {
			Integer value = iterator.next();
			
			for(int i=0;i<l.size();i++) {
				count = count + l.get(i);
			}
			
			if (count % 2 == 0) {
				break;
			}
			iterator.remove();
			count = 0;

		}
	
	System.out.println("****"+l.size());
	
	}

}
