package com.hj.dao;

import com.hj.domain.User;

import java.util.List;
public interface IUserDao {
    List<User> findAll();
}
