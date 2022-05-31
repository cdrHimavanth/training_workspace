package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

//import com.model.User;

public class MySQLConnectionCheck {

	public static Connection getConnection() {
		Connection connection = null;
		/*
		 * Statement statement = null; ResultSet resultSet = null;
		 */
		//List<User> users= new ArrayList<User>();
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/batch2";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, "root", "Reset123");
			System.out.println(connection != null ? "connection established" : "connection failed");
			/* statement = connection.createStatement(); */
			
			/*
			 * for(int i=0;i<10;i++) {
			 * statement.addBatch("INSERT INTO user(user_name,password) VALUES ("+"Hima"+i+
			 * ",STG"+i+")"); }
			 */
			/*
			 * resultSet = statement.executeQuery("SELECT * FROM user;");
			 * while(resultSet.next()) { User user= new
			 * User(resultSet.getInt("user_id"),resultSet.getString("user_name"),resultSet.
			 * getString("password")); users.add(user);
			 * System.out.println(resultSet.getInt(1)+resultSet.getString(2)+resultSet.
			 * getString(3)); }
			 */
			/*
			 * for(User user:users) { System.out.println(user); }
			 */
		} catch (ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}

		return connection;
	}
}
