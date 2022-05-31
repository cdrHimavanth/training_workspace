package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User createUser(User user) {
		String sqlQuery = " INSERT INTO user(user_name,password) VALUES (?,?);";
		Connection connection = MySQLConnectionCheck.getConnection();
		PreparedStatement preparedStatement = null;
		int temp = 0;
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			temp = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		if(temp==1) {
			return user;
		}
		
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User validateUserIdAndPassword(int id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readAllUsers() {
		Connection connection = MySQLConnectionCheck.getConnection();

		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM user;");
			while (resultSet.next()) {
				/*
				 * User user = new User(resultSet.getInt("user_id"),
				 * resultSet.getString("user_name"), resultSet.getString("password"));
				 * users.add(user);
				 */
				System.out.println(resultSet.getInt(1) +"  "+ resultSet.getString(2) +"  "+ resultSet.getString(3));
			}
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}


		

	}

}
