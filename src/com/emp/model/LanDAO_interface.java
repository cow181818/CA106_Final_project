package com.emp.model;

import java.util.List;

public interface LanDAO_interface {
	public void insert(LanVO lanVo);
	public void update(LanVO  lanVo);
	public void delete(String LAN_ID);
	public LanVO findByPrimaryKey(String LAN_ID);
	public List<LanVO>getall();
	
	
}
