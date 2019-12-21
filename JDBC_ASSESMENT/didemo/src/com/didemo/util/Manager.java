package com.didemo.util;

import com.didemo.dao.A;
import com.didemo.dao.I;

public class Manager {
	
	public I getI() {
		
		return new A();
	}

}
