package com.npntraining.handson;

public class GarbageCollector {
	
	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args) {
		GarbageCollector gc = new GarbageCollector();
		GarbageCollector gc1 = new GarbageCollector();
		
		gc = null;
		gc1 = null;
		
		System.gc();
	}

}
