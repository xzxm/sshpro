package com.ds.service;

import com.ds.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2018/11/23 0023.
 */
public interface UserService {
    public List<User> findList();
    public void saveUser(User user);
    public User findUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}
