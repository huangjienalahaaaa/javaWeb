package com.hj.dao;

import com.hj.domain.User;

import java.util.List;

/**用户的持久层接口
 * @author hj
 * @create 2020-07-11 9:30
 */
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
