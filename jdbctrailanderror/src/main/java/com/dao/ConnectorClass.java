package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorClass {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/batch2";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, "root", "Reset123");
			System.out.println(connection != null ? "connection established" : "connection failed");
		}catch (ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
