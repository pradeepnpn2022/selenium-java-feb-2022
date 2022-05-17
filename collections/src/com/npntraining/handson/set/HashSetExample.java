package com.npntraining.handson.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set.add("First"));
		
		System.out.println("The size of the set is :: " + set.size());
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
