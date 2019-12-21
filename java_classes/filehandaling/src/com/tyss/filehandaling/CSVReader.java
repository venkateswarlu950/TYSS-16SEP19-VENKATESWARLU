package com.tyss.filehandaling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {
	public static void main(String[] args) {
		try(FileReader in = new FileReader("csv.txt");
		BufferedReader reader = new BufferedReader(in)){
			while(reader.ready()) {
				String line = reader.readLine();
				System.out.println(line);
				String[] words = line.split(",");
				System.out.println("id ::"+words[0]);
				System.out.println("name ::"+words[1]);
				System.out.println("sal ::"+words[2]);
				System.out.println("gen ::"+words[3]);
				System.out.println("=============================");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
