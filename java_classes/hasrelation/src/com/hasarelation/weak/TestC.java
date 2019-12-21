package com.hasarelation.weak;

public class TestC {
	
	public static void main(String[] args) {
		
      Studentbean s = new Studentbean();
      
      s.setId(124578);
      s.setName("greeshma");
      s.setRollNo(123);
      
      Database d = new Database();
      d.receive(s);
		
	}

}
