package com.lamdaexpression;

public class TestMsg {
	
	public static void main(String[] args) {
		
		      AddMessage am = (String message) -> {
		    	   
		    	   System.out.println("hai hello venakat");
		    	   System.out.println(message);
				return message;
		      };
		     am.getMsg("how are you");
		    
		
	}

}
