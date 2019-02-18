package com.emp.model;

import java.util.List;

public interface MemDAO_interface {
	public void insert(MemVO memVo);
	public void update(MemVO memVo);
	public void delete(String MEM_ID);
	public MemVO findByPrimaryKey(String MEM_ID);
	public List<MemVO>getAll();
	
}
