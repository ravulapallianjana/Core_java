package com.FileIo;

import java.io.File;

public class FolderCreated {

	public static void main(String[] args) {
	File f=new File("C:\\Users\\ravul\\OneDrive\\Desktop\\fileioexamples\\anjana");
	boolean st=f.mkdir();
	System.out.println(st);
	if(st) {
		System.out.println("folder has been created ");
	}else {
		System.out.println(" something went wrong");
	}
	}

}
