package com.emp.model;

import java.util.List;

public interface Emp_PerDAO_interface {

		public void insert( Emp_PerVO emp_perVo);
		public void update(Emp_PerVO emp_perVo);
		public void delete(String EMP_ID);
		public Emp_PerVO findByPrimaryKey(String EMP_ID);
		public List<Emp_PerVO>getall();
	
	
}
