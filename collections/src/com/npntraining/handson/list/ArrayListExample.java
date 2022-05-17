package com.npntraining.handson.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		System.out.println("The size of the array list:: "+ list.size());
				
		System.out.println("List is empty or not? " + list.isEmpty());
		
		list.add(0, "First");
		list.add(1, "Second");
		list.add(2, 3);
		
		System.out.println("My first list is :: " + list);
		
		list.set(2, "Third");
		
	
		
		System.out.println("My updated list is :: " + list);
		
		list.add("Another");
		
		
		
		System.out.println("My latest list is :: "+list);
		
		System.out.println("The size of the array list:: "+ list.size());
		
		for (Object test : list) {
			
			System.out.println(test);
		}
		
		System.out.println("The index of third object is :: " + list.indexOf("Third"));
		
	}

}
