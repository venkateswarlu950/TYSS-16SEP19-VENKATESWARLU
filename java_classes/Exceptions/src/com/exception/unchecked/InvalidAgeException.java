package com.exception.unchecked;

public class InvalidAgeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg = "invalid age below 18 yeras not allowed";
	
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		
		return msg;
		
	}
	

}
