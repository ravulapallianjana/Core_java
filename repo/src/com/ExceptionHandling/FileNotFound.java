package com.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class FileNotFound {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\ravul\\Downloads\\Documents - Copy\\New folder\\javanotes.txt");
		
		try {
			f.createNewFile();
			System.out.println("file created successfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
