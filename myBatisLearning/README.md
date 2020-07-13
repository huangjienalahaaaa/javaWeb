# v2.1 myBatis入门（注解的方式）：

1. 删除 src/main/resources/下的com整个包(除去.xml文件)
2. 在com.hj.dao.IUserDao下写注解
3. 在主配置文件SqlMapConfig.xml中编写映射关系


明确：
我们在实际开发中，都是越简便越好，所以都是采用不写dao实现类的方式。
不管使用xml还是注解配置
但是mybatis它是支持写dao实现类的。、

所以接下去v2.2 我们实现一下：

不改变原来的方式，自己来写dao实现类，该怎么用