package com.ghost.finalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public enum Lang {
	
	A,S,B,J;

}
class Test1{
	
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("Akshay");
		list.add("BBB");
		list.add("Dhanshree");
		System.out.println(list);
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			
			String next = it.next();
			//System.out.println(next);
			if(next.equals("Akshay")) {
				it.remove();
			}
		}*/
		/*
		for (String string : list) {
			if(string.equals("Akshay")) {
				list.remove(string);
			}
		}*/
		System.out.println(list);
		
		
		
		List<String> copyList = new CopyOnWriteArrayList<String>();
		copyList.add("AAA");
		copyList.add("Akshay");
		copyList.add("BBB");
		copyList.add("Dhanshree");
		System.out.println(copyList);
		/*
		Iterator<String> itr = copyList.iterator();
		while(itr.hasNext()) {
			
			String next = itr.next();
			if(next.equals("Akshay")) {
				copyList.remove(next);
			}
		}*/
		for (String string : copyList) {
			if(string.equals("Akshay")) {
				copyList.remove(string);
			}
		}
		System.out.println(copyList);
}
}
