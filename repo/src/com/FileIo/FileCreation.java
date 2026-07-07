package com.FileIo;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ravul\\OneDrive\\Desktop\\fileioexamples\\anju.txt");
		boolean st = f.createNewFile();
		if (st) {
			System.out.println("file has been created");
		}else {
			System.out.println("something went wrong ");
		}
		boolean isExist=f.exists();
		if(isExist) {
			System.out.println("file has been created");
		}else {
			System.out.println("file already existed ");
		}
	}

}
