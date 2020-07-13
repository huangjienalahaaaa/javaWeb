# v2.0 myBatis入门（xml的方式）：
  *
     * 1. 读取配置文件
     * 2. 创建sqlSessionFactory工程
     * 3. 使用工厂生产sqlSession对象
     * 4. 使用sqlSession创建Dao接口的代理对象
     * 5. 使用代理对象执行方法
     * 6. 释放资源
     
   注意事项：
        不要忘记在映射配置中告知mybatis要封装到哪个实体类中
        配置的方式：指定实体类的全限定类名
        
  