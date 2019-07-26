package com.db.EmployeeManagementSystem.dao;

import com.db.EmployeeManagementSystem.bean.LoginBean;

public interface loginDAO {
	
	public boolean authenticate(LoginBean login);
	
}
