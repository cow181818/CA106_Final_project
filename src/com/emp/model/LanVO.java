package com.emp.model;

import java.io.Serializable;

public class LanVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String LAN_ID;
	private String MEM_ID;
	private String LAN_RECEIPT;
	private Integer LAN_ACCOUNT;
	private String LAN_ACCOUNTSTATUS;
	private Byte LAN_CIZITEN;
	public String getLAN_ID() {
		return LAN_ID;
	}
	public void setLAN_ID(String lAN_ID) {
		LAN_ID = lAN_ID;
	}
	public String getMEM_ID() {
		return MEM_ID;
	}
	public void setMEM_ID(String mEM_ID) {
		MEM_ID = mEM_ID;
	}
	public String getLAN_RECEIPT() {
		return LAN_RECEIPT;
	}
	public void setLAN_RECEIPT(String lAN_RECEIPT) {
		LAN_RECEIPT = lAN_RECEIPT;
	}
	public Integer getLAN_ACCOUNT() {
		return LAN_ACCOUNT;
	}
	public void setLAN_ACCOUNT(Integer lAN_ACCOUNT) {
		LAN_ACCOUNT = lAN_ACCOUNT;
	}
	public String getLAN_ACCOUNTSTATUS() {
		return LAN_ACCOUNTSTATUS;
	}
	public void setLAN_ACCOUNTSTATUS(String lAN_ACCOUNTSTATUS) {
		LAN_ACCOUNTSTATUS = lAN_ACCOUNTSTATUS;
	}
	public Byte getLAN_CIZITEN() {
		return LAN_CIZITEN;
	}
	public void setLAN_CIZITEN(Byte lAN_CIZITEN) {
		LAN_CIZITEN = lAN_CIZITEN;
	}
	
	
	
}
