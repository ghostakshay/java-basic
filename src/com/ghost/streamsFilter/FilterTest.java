package com.ghost.streamsFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ghost.finalTest.Employee;

public class FilterTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(3);
		list.add(6);
		list.add(11);
		list.add(16);
		
		//find min and max value.
		//Optional<Integer> findFirst = list.stream().min(null);
		//System.out.println("First : "+findFirst.get());
		
		//Create New List with Even Value.
		System.out.println(list);
		ArrayList<Integer> list1 = (ArrayList<Integer>) list.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Test");
		list2.add("Strwamns");
		list2.add("mapTest");
		list2.add("GhostMan");
		list2.add("GhostRider");
		
		//Get List contain object length >5
		ArrayList<String> list3 = (ArrayList<String>) list2.stream().filter(S->S.length()>5).collect(Collectors.toList());
		System.out.println(list3);
		
		//
		Employee e1 = new Employee(1, "Synerzip-Ghost", null);
		Employee e2 = new Employee(2, "Ghost-excellarate", null);
		Employee e3 = new Employee(3, "Ghost-HDFC", null);
		Employee e4 = new Employee(4, "ghost", null);
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		Comparator<Employee> empComp = Comparator.comparing(Employee::getId);
		Comparator<Employee> empComp1 = (E1,E2) ->  {return E2.getId() - E1.getId();};
		
		Collections.sort(emplist,empComp);
		System.out.println(emplist);
		
		Collections.sort(emplist,empComp1);
		System.out.println(emplist);
		
		 String name = emplist.stream().filter(E -> E.getName().startsWith("G")).findAny().get().getName();
		 Optional<String> findAny = emplist.stream().filter(E -> E.getName().startsWith("G")).map(Employee::getName).findAny();
		System.out.println(name);
		System.out.println(findAny.get());
	}
}
