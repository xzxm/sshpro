package com.ds.dao;

import com.ds.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findList();
    public void saveUser(User user);
    public User findUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}
