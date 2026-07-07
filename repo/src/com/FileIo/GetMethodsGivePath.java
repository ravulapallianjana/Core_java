package com.FileIo;

import java.io.File;
import java.io.IOException;

public class GetMethodsGivePath {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ravul\\OneDrive\\Desktop\\fileioexamples\\anjana");

		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
	}

}
