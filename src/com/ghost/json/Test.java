package com.ghost.json;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.ghost.test.List;

public class Test {

	
	public static void main(String[] args) {
	
		
		HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pansare");
		list.add("Akshay");
		//Collections.sort(list);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Yadav");
		list1.add("Dhanshree");
		//Collections.sort(list1);
		
		map.put("System", list);
		map.put("eq", list1);
		
		System.out.println(map);
		
		Collections.sort(map.get("System"));
		Collections.sort(map.get("eq"));
		
		System.out.println(map);
	}
	
	
}
