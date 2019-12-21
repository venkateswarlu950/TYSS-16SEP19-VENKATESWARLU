package com.exceptions.second;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class FileTest {
	
	public void open() throws IOException, ClassNotFoundException, SQLException {
		File f = new File("b.txt");
		f.createNewFile();
		
		Class.forName("com.a");
	}

}
