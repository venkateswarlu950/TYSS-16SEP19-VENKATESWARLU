package com.tyss.filehandaling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	
	public static void main(String[] args) {
		
		String path = "text.properties";
		FileReader reader = null;
		
		try {
			reader = new FileReader(path);
			Properties property = new Properties();
			property.load(reader);
			String name = property.getProperty("name");
			String comp = property.getProperty("company");
			String gf = property.getProperty("gf");
			
			System.out.println(name);
			System.out.println(comp);
			System.out.println(gf);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
