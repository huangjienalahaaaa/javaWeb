package com.hj.com.hj.test;

import com.hj.dao.IUserDao;
import com.hj.domain.User;

import java.io.InputStream;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisTest {
    public static void main(String[] args) throws Exception{

        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        SqlSession session = factory.openSession();

        IUserDao userDao = session.getMapper(IUserDao.class);

        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }

        session.close();
        in.close();
    }
}
