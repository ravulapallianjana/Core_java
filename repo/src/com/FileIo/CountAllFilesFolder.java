package com.FileIo;

import java.io.File;

public class CountAllFilesFolder {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\ravul\\OneDrive\\Documents");
		String[] s = f.list();
		int count = 0;
		for (String name : s) {
			System.out.println(name);
			count++;
		}
		System.out.println(count);
		File[] files = f.listFiles();
		int dircount = 0;
		int filecount = 0;
		int miscount = 0;
		for (File file : files) {
			if (file.isDirectory()) {
				dircount++;
			} else if (file.isFile()) {
				filecount++;

			}else {
				miscount++;
			}
		}
			System.out.println(dircount);
			System.out.println(filecount);
			System.out.println(miscount);
		

	}

}
