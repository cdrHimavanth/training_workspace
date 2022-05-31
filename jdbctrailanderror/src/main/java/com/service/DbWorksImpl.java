package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.dao.ConnectorClass;
import com.model.User;

public class DbWorksImpl implements DbWorks {

	@Override
	public User createUser(String name, String password) {
		int id = 0;
		User user=null;
		String createQuery = "INSERT INTO user(user_name,password) values (\""+name+"\""+",\""+password+"\""+")";
		String selectQuery = "SELECT max(user_id) as id from user;";
		try {
			Connection connection = ConnectorClass.getConnection();
			Statement statement = connection.createStatement();
			int status = statement.executeUpdate(createQuery);
			if(status==1) {
				System.out.println("User added");
			}else {
				System.out.println("Something wrong");
			}
			ResultSet result = statement.executeQuery(selectQuery);
			while(result.next()) {
				id = result.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(id!=0) {
			user = new User(id,name,password);
			return user;
		}
		return null;
	}

	@Override
	public void readAllUsers() {
		Connection connection = ConnectorClass.getConnection();
		String getQuery = "SELECT * FROM user;";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(getQuery);
			while(resultSet.next()) {
				User user = new User(resultSet.getInt("user_id"),resultSet.getString("user_name"),resultSet.getString("password"));
				System.out.println(user);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

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
	public List<User> getUserByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User validateUserIdAndPassword(int id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(int user_id,String name,String password) {
		Connection connection = null;
		String updateQuery = "UPDATE user set user_name=\""+name+"\",password="+"\""+password+"\" where user_id=\""+user_id+"\";";
		try {
			connection = ConnectorClass.getConnection();
			Statement statement = connection.createStatement();
			int status  = statement.executeUpdate(updateQuery);
			if(status==1) {
				System.out.println("Update successful");
			}else {
				System.out.println("Update unsuccessful");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public boolean deleteUserById(int userId) {
		Connection connection = null;
		String deleteQuery = "DELETE FROM user where user_id=\""+userId+"\";";
		int status = 0;
		try {
			connection = ConnectorClass.getConnection();
			Statement statement = connection.createStatement();
			status  = statement.executeUpdate(deleteQuery);
			if(status!=0) {
				System.out.println("Delete successful");
			}else {
				System.out.println("Delete unsuccessful");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if(status==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUserByName(String userName) {
		Connection connection = null;
		String deleteQuery = "DELETE FROM user where user_name=\""+userName+"\";";
		int status = 0;
		try {
			connection = ConnectorClass.getConnection();
			Statement statement = connection.createStatement();
			status  = statement.executeUpdate(deleteQuery);
			if(status==1) {
				System.out.println("Delete successful");
			}else {
				System.out.println("Delete unsuccessful");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if(status==1) {
			return true;
		}
		return false;
	}

}
