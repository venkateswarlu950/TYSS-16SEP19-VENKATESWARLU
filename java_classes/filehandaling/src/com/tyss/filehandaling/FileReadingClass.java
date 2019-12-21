package com.tyss.filehandaling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	
	public static void main(String[] args) {
		
	  String path = "C:\\Users\\venkat chowdary\\Desktop\\txt.txt";
	  
	  try {
		@SuppressWarnings("resource")
		FileReader reader = new FileReader(path);
		int i;
		i = reader.read();
		System.out.println(i);
		
		while((i=reader.read())!=-1) {
			System.out.print((char)i);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}// end of main()

}//end of FileReadingClass
