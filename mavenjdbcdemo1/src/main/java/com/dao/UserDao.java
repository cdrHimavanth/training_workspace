package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	// crud
	public abstract User createUser(User user);
	
	public abstract void readAllUsers();

	public abstract List<User> getAllUsers();

	public abstract User getUserById(int userId);

	public abstract User getUserByName(String userName);
	
	public abstract User validateUserIdAndPassword(int id,String password);

	public abstract User updateUser(User user);

	public abstract User deleteUserById(int userId);

	public abstract User deleteUserByName(String userName);

}
