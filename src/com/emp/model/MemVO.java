package com.emp.model;

import java.io.Serializable;
import java.sql.Date;

public class MemVO  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String MEM_ID;
	private String MEM_NAME;
	private Date  MEM_BIRTHDAY;
	private String MEM_PASSWORD;
	private String  MEM_ADDRESS;
	private String MEM_ZIPCODE;
	private Integer MEM_TELEPHONE;
	private Integer  MEM_PHONE;
	private String MEM_EMAIL;
	private String MEM_STATUS;
	private Byte MEM_PICTURE;
	private Integer GOOD_TOTAL;
	private String MEM_SEX;
	
	public String getMEM_ID() {
		return MEM_ID;
	}
	public void setMEM_ID(String mEM_ID) {
		MEM_ID = mEM_ID;
	}
	public String getMEM_NAME() {
		return MEM_NAME;
	}
	public void setMEM_NAME(String mEM_NAME) {
		MEM_NAME = mEM_NAME;
	}
	public Date getMEM_BIRTHDAY() {
		return MEM_BIRTHDAY;
	}
	public void setMEM_BIRTHDAY(Date mEM_BRITHDAY) {
		MEM_BIRTHDAY = mEM_BRITHDAY;
	}
	public String getMEM_PASSWORD() {
		return MEM_PASSWORD;
	}
	public void setMEM_PASSWORD(String mEM_PASSWORD) {
		MEM_PASSWORD = mEM_PASSWORD;
	}
	public String getMEM_ADDRESS() {
		return MEM_ADDRESS;
	}
	public void setMEM_ADDRESS(String mEM_ADDRESS) {
		MEM_ADDRESS = mEM_ADDRESS;
	}
	public String getMEM_ZIPCODE() {
		return MEM_ZIPCODE;
	}
	public void setMEM_ZIPCODE(String mEM_ZIPCODE) {
		MEM_ZIPCODE = mEM_ZIPCODE;
	}
	public Integer getMEM_TELEPHONE() {
		return MEM_TELEPHONE;
	}
	public void setMEM_TELEPHONE(Integer mEM_TELEPHONE) {
		MEM_TELEPHONE = mEM_TELEPHONE;
	}
	public Integer getMEM_PHONE() {
		return MEM_PHONE;
	}
	public void setMEM_PHONE(Integer mEM_PHONE) {
		MEM_PHONE = mEM_PHONE;
	}
	public String getMEM_EMAIL() {
		return MEM_EMAIL;
	}
	public void setMEM_EMAIL(String mEM_EMAIL) {
		MEM_EMAIL = mEM_EMAIL;
	}
	public String getMEM_STATUS() {
		return MEM_STATUS;
	}
	public void setMEM_STATUS(String mEM_STATUS) {
		MEM_STATUS = mEM_STATUS;
	}
	public Byte getMEM_PICTURE() {
		return MEM_PICTURE;
	}
	public void setMEM_PICTURE(Byte mEM_PICTURE) {
		MEM_PICTURE = mEM_PICTURE;
	}
	public Integer getGOOD_TOTAL() {
		return GOOD_TOTAL;
	}
	public void setGOOD_TOTAL(Integer gOOD_TOTAL) {
		GOOD_TOTAL = gOOD_TOTAL;
	}
	public String getMEM_SEX() {
		return MEM_SEX;
	}
	public void setMEM_SEX(String mEM_SEX) {
		MEM_SEX = mEM_SEX;
	}
	
	
	
	
}
