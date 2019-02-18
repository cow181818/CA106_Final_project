package com.goodhouse.emp.model;

import java.io.Serializable;

public class EmpVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String EMP_ID;
	private String EMP_NAME;
	private Integer EMP_PHONE;
	private String EMP_ACCOUNT;
	private String EMP_PASSWORD;
	private String EMP_STATUS;
	public String getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(String eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public Integer getEMP_PHONE() {
		return EMP_PHONE;
	}
	public void setEMP_PHONE(Integer eMP_PHONE) {
		EMP_PHONE = eMP_PHONE;
	}
	public String getEMP_ACCOUNT() {
		return EMP_ACCOUNT;
	}
	public void setEMP_ACCOUNT(String eMP_ACCOUNT) {
		EMP_ACCOUNT = eMP_ACCOUNT;
	}
	public String getEMP_PASSWORD() {
		return EMP_PASSWORD;
	}
	public void setEMP_PASSWORD(String eMP_PASSWORD) {
		EMP_PASSWORD = eMP_PASSWORD;
	}
	public String getEMP_STATUS() {
		return EMP_STATUS;
	}
	public void setEMP_STATUS(String eMP_STATUS) {
		EMP_STATUS = eMP_STATUS;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
