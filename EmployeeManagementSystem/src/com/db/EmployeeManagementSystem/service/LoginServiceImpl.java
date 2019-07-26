package com.db.EmployeeManagementSystem.service;

import com.db.EmployeeManagementSystem.bean.LoginBean;
import com.db.EmployeeManagementSystem.dao.loginDAO;
import com.db.EmployeeManagementSystem.dao.loginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	loginDAO loginDao = new loginDAOImpl();
	public boolean authenticate(LoginBean login) {
		// TODO Auto-generated method stub
		return loginDao.authenticate(login);
	}

}
