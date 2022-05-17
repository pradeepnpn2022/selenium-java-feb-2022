package com.npntraining.handson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedExceptionHandling {
	
	public static void main(String[] args)  {
		
		File file = new File("D://test.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
//			e.printStackTrace();
			System.out.println("Exception have been handled");
		}
	}

}
