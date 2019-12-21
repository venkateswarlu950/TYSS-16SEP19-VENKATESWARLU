package com.tyss.filehandaling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithCSVFile {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = " insert into employee_info values(?,?,?,?)";
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in)){
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement ptm = conn.prepareStatement(sql);
			while(reader.ready()) {
				String line = reader.readLine();
				String[] datas = line.split(",");
				String id = datas[0];
				int empId = Integer.parseInt(id);
				String name = datas[1];
				String sal = datas[2];
				int salr = Integer.parseInt(sal);
				String gen = datas[3];
				
				ptm.setInt(1, empId);
				ptm.setString(2, name);
				ptm.setInt(3, salr);
				ptm.setString(4, gen);
				
//				int count = ptm.executeUpdate();
//				System.out.println(count +"::rows inserted");
				ptm.addBatch();
				
//				
				
			}
			int[] counts = ptm.executeBatch();
			System.out.println(counts.length +"rows inserted");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
