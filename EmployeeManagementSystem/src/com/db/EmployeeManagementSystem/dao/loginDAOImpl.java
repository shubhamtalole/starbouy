package com.db.EmployeeManagementSystem.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.EmployeeManagementSystem.bean.LoginBean;
import com.db.EmployeeManagementSystem.util.DBUtil;
import com.mysql.jdbc.PreparedStatement;

public class loginDAOImpl implements loginDAO {

	public boolean authenticate(LoginBean login) {
		// TODO Auto-generated method stub
		//statement, preparedStatement, Callable
		String query = "select * from login_table where username=? and password=?";
		Connection connection = null;
		connection = DBUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		connection = DBUtil.getConnection();
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setString(1, login.getUserName());
			preparedStatement.setString(2, login.getPassword());
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(connection);
			
		}
		
		return false;
	}

}
