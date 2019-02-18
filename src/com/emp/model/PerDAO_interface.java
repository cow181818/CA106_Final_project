package com.emp.model;

import java.util.List;

public interface PerDAO_interface {
	public void inser(PerVO perVo);
	public void update(PerVO perVo);
    public void delete(String PER_ID);
    public PerVO findByPrimaryKey(String PER_ID);
    public List<PerVO> getAll();
}
