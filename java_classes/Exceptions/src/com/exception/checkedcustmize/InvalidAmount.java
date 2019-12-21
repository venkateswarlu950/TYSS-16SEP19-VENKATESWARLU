package com.exception.checkedcustmize;

public class InvalidAmount extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mssg = "daily limit is 40000";
	
	public String getMessage() {
		
		return mssg;
		
		
	}

}
