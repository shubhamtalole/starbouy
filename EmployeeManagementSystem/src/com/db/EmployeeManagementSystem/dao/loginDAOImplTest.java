package com.db.EmployeeManagementSystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.EmployeeManagementSystem.bean.LoginBean;

import org.junit.jupiter.api.Test;

class loginDAOImplTest {

	@Test
	void testAuthenticate() {
		LoginBean loginBean = new LoginBean("admin","root");
		Assertions.assertEquals(true,new loginDAOImpl().authenticate(loginBean));		
	}

}
