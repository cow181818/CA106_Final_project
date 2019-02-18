package com.emp.model;

import java.io.Serializable;

public class Emp_PerVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String EMP_ID;
	private String PER_ID;
	public String getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(String eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getPER_ID() {
		return PER_ID;
	}
	public void setPER_ID(String pER_ID) {
		PER_ID = pER_ID;
	}
	
}
