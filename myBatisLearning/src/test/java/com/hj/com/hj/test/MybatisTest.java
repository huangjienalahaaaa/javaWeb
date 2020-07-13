package com.hj.com.hj.test;

import com.hj.dao.IUserDao;
import com.hj.dao.impl.IserDaoImpl;
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
     */
    public static void main(String[] args) throws Exception{


        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
//        3.使用工厂创建dao对象
        IUserDao userDao = new IserDaoImpl(factory);

        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
//        //6.释放资源
//        session.close();
        in.close();
    }
}
