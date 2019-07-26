package com.db.EmployeeManagementSystem.service;

import com.db.EmployeeManagementSystem.bean.LoginBean;

public interface LoginService {
	
	public boolean authenticate(LoginBean login);
}
