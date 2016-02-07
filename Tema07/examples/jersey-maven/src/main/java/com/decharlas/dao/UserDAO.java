package com.decharlas.dao;

import java.util.ArrayList;
import java.util.List;

import com.decharlas.model.User;

public class UserDAO {

	private static List<User> users;

	static {
		users = new ArrayList<User>();
		users.add(new User(Integer.valueOf(1), "Pedro Perez Pardo"));
		users.add(new User(Integer.valueOf(2), "Juan Gutierrez Rodriguez"));
	}

	public UserDAO() {
	}

	public List<User> getUsers() {
		return users;
	}

	public void removeUser(int id) {
		for (User user : users) {
			if (user.getId().intValue() == id) {
				users.remove(user);
			}
		}
	}

	public User addUser(User user) {
		users.add(user);
		return user;
	}

	public User updateUser(User user) {
		for (User currentUser : users) {
			if (currentUser.getId().intValue() == user.getId().intValue()) {
				users.remove(currentUser);
				users.add(user);
			}
		}
		return user;
	}
}