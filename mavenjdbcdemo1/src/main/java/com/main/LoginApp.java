package com.main;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class LoginApp {

	public static void main(String[] args) {
		UserDao dao = new  UserDaoImpl();
		User user = new User("hia","asbdasbd");
		if(dao.createUser(user)!=null) {
			System.out.println("User created");
		}else {
			System.out.println("User creation failed");
		}
		
		dao.readAllUsers();
		
	}

}
