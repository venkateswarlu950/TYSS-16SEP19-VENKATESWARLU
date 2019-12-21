package com.exception.checkedcustmize;

public class ValidateAmount {
	
	void checkAmount(int amount) throws InvalidAmount {
		if(amount > 40000) {
			
			throw new InvalidAmount();
		}
		
		
	}

}
