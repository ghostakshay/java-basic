package com.ghost.lambda.comparatortest;

import java.util.Comparator;
/**
 * 
 * @author akshayp
 * Use Lambda For Comparator Interface.
 * Instead of writing New Class for implementation of Comparator inteface
 * write single line lambda expression.
 *
 */
public class TraditionalComparator implements Comparator<Integer> {


	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2 -o1;
	}
	
}
