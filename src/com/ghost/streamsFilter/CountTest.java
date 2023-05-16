package com.ghost.streamsFilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Test");
		list.add("Strwamns");
		list.add("mapTest");
		list.add("GhostMan");
		list.add("GhostRider");
		
		//get Count
		long count = list.stream().count();
		System.out.println("Size "+count);
		
		//get Count of object whose length >5
		long count2 = list.stream().filter(S->S.length()>5).count();
		System.out.println(count2);
		
		//get count and list start with G
		long count3 = list.stream().filter(S-> S.startsWith("G")).count();
		System.out.println(count3);
		
		List<String> collect = list.stream().filter(S-> S.startsWith("G")).map(S-> S.concat(" India")).collect(Collectors.toList());
		System.out.println(collect);
		
		//sort the list
		//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
