package com.ExceptionHandling;

import java.io.File;
import java.io.FileReader;

public class Readerfile {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {

			File f = new File("C:\\Users\\ravul\\Downloads\\Documents - Copy\\New folder\\javanotes.txt");

			FileReader fr = new FileReader(f);
			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}