package com.emp.model;

import java.io.Serializable;

public class PerVO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private String PER_ID;
	private String PER_NAME;
	
	public String getPER_ID() {
		return PER_ID;
	}
	public void setPER_ID(String pER_ID) {
		PER_ID = pER_ID;
	}
	public String getPER_NAME() {
		return PER_NAME;
	}
	public void setPER_NAME(String pER_NAME) {
		PER_NAME = pER_NAME;
	}

	
	
}
