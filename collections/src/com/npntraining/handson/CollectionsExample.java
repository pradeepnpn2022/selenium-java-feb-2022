package com.npntraining.handson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("Two One");
		list.add("One");
		list.add("One One");
		
		
		System.out.println("Befor adding object using Collections :: " + list);
		
		Collections.addAll(list, "Two Two", "Zero", "Zero One");
		
		System.out.println("After adding objects using Collections :: "+list); 
		
		Collections.sort(list);
		
		System.out.println("Sorted list is :: " + list);
	}

}
