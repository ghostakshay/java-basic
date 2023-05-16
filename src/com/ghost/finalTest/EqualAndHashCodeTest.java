package com.ghost.finalTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author akshayp
 * 
 *         If Two Object Are equals by equal() method then they must produce
 *         same hashcode. If Two Object produce same hashcode they may or may
 *         not be same.
 *
 */
public class EqualAndHashCodeTest {

	private int id;
	private String name;

	public EqualAndHashCodeTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualAndHashCodeTest other = (EqualAndHashCodeTest) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {

		EqualAndHashCodeTest e1 = new EqualAndHashCodeTest(1, "Dhanshree");
		EqualAndHashCodeTest e2 = new EqualAndHashCodeTest(1, "Dhanshree");

		System.out.println("Shallow Compare " + (e1 == e2));
		System.out.println("Deep Compare " + (e1.equals(e2)));
		System.out.println("HashCode" + (e1.hashCode()));
		System.out.println("Deep Compare " + (e2.hashCode()));

		HashMap<EqualAndHashCodeTest, String> map = new HashMap<EqualAndHashCodeTest, String>();
		map.put(e1, "Akshay");
		map.put(e2, "IBM");
		System.out.println(map.size());
		System.out.println("Value" + map.get(e1));

		String s = "Test";
		String s1 = s;
		System.out.println(s1 == s);

		StringBuffer sb = new StringBuffer("Ghost");

		StringBuffer sb1 = new StringBuffer("Ghost");

		System.out.println(sb.equals(sb1));

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Collections.synchronizedCollection(list);
		System.out.println(list);
		// It will throw concurrentmodification exception as list is failfast
		/*for (Integer integer : list) {

			if (integer == 5)
				list.remove(integer);

		}*/
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer == 5)
				iterator.remove();
				//list.remove(integer);

		}

		System.out.println(list);
		
		
		
		Map<String ,Integer> m = new HashMap<String, Integer>(); //Not Thread Safe
		Collections.synchronizedMap(m); // Thread Safe.
		Map<String ,Integer> m1 = new ConcurrentHashMap(); //Thread Safe
	}

}
