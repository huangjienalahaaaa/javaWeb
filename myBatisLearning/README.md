# v3.0 自定义myBatis的分析-执行查询所有分析

* MyBatis 再使用代理dao的方式实现增删改查时做什么事了呢？
-> 只有2件事：
    1. 创建代理对象
    2. 在代理对象中调用selectList

1. 对主配置文件(sqlMapConfig.xml)：

![](img/1.jpg)



2. 对映射配置文件(IUserDao.xml):
![](img/2.jpg)

3. 流程：
![](img/3.jpg)
![](img/4.jpg)
![](img/5.jpg)
![](img/6.jpg)
![](img/7.jpg)
![](img/8.jpg)