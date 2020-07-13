package com.hj.com.hj.test;

import com.hj.dao.IUserDao;
import com.hj.domain.User;

import java.io.InputStream;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



/**
 * @author hj
 * @create 2020-07-13 8:32
 * myBatis的入门案例
 */
public class MybatisTest {
    /**
     * 入门案例：
     * 实现步骤：
     *
     * 1. 读取配置文件
     * 2. 创建sqlSessionFactory工程
     * 3. 使用工厂生产sqlSession对象
     * 4. 使用sqlSession创建Dao接口的代理对象
     * 5. 使用代理对象执行方法
     * 6. 释放资源
     */
    public static void main(String[] args) throws Exception{


        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
