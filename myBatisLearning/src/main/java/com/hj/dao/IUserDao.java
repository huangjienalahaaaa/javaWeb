package com.hj.dao;

import com.hj.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();
}
