package com.npntraining.handson.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		Map<String, String> test = new HashMap<String, String>();
		
		test.put("11", "TestOne");
		test.put("12", "TestTwo");
		test.put("13", "TestThree");
		
		System.out.println("Size of the map is:: "+test.size());
		System.out.println(test);
		
		System.out.println("Trying to add duplicate key :: " + test.put("12", "TestTwo"));
		
		System.out.println(test);
		
		for (Map.Entry<String, String> map  : test.entrySet()) {
			System.out.println("Key is :: "+ map.getKey()+ " Value is ::"+ map.getValue());
			
		}
		
	}

}
