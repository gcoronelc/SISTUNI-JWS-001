package com.decharlas.test.dao;

import java.util.ArrayList;
import java.util.List;

import com.decharlas.test.model.User;

public class UserDAO {

  private static List<User> users;
  
  static{
    users = new ArrayList<User>();
    users.add(new User(Integer.valueOf(1), "Pedro Perez Pardo"));       
    users.add(new User(Integer.valueOf(2), "Juan Gutierrez Rodriguez"));
    users.add(new User(Integer.valueOf(3), "Gustavo Coronel"));         
    users.add(new User(Integer.valueOf(4), "Claudia Fernandez"));       
  }

  public UserDAO() {
  }

  public List<User> getUsers() {
    return users;
  }
  
  public User getUser(int id) {
    User user = null;
    for (User bean : users) {
      if (bean.getId().intValue() == id) {
        user = bean;
      }
    }
    return user;
  }

  public void removeUser(int id) {
    for (User user : users) {
      if (user.getId().intValue() == id) {
        users.remove(user);
        break;
      }
    }
  }

  public User addUser(User user) {
    users.add(user);
    return user;
  }

  public User updateUser(User user) {
    for (User currentUser : users) {
      if (currentUser.getId() == user.getId()) {
        users.remove(currentUser);
        users.add(user);
      }
    }
    return user;
  }
}