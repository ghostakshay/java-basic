package com.ghost.lambda.comparatortest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * 
 * @author akshayp
 * Use Lambda For Comparator Interface.
 * Instead of writing New Class for implementation of Comparator inteface
 * write single line lambda expression.
 *
 */
public class TestLambdaCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(50);
		l.add(70);
		l.add(150);
		System.out.println(l);
		//Need To Sort Arraylist using comparator
		Comparator<Integer> c = (I1,I2) -> { return I1-I2;};
		Collections.sort(l,c);
		//Collections.sort(l,new TraditionalComparator());
		System.out.println(l);
		l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
}
