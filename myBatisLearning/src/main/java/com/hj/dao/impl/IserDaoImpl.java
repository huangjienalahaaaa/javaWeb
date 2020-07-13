package com.hj.dao.impl;

import com.hj.dao.IUserDao;
import com.hj.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class IserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;
    public  IserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;
    }

    public List<User> findAll(){

    //1.使用工厂创建sqlSession对象
        SqlSession session = factory.openSession();
    // 2.使用session执行查询所有方法
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findAll");
    // 3.关闭
        session.close();
    // 4. 返回查询结果
        return users;
    }
}
