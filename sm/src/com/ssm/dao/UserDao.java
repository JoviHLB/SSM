package com.ssm.dao;

import com.ssm.po.User;

public interface UserDao {
    public User findUserById(Integer id);
}
