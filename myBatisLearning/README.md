v1.0 环境搭建


# 搭建环境的注意事项：
1. 创建IUserDao.xml 和 IUserDao.java时名称是为了和我们之前的知识保持一致。在Mybatis中它把持久层的操作接口名称和映射文件也叫做：Mapper。所以：IUserDao和IUserMapper是一样的
2. 在ideal中创建目录的时候，它和包是不一样的：
    包在创建时：com.hj.dao它是三级结构
    目录在创建时：com.hj.dao是一级目录
3. Mybatis的映射配置文件位置必须和dao接口的包接口相同
4. 映射配置文件的mapper标签namespace属性的取值必须是dao接口的全限定类名
5. 映射配置文件的操作配置(select),id属性的取值必须是dao接口的方法名

当我们遵从了第3,4,5点之后，我们在开发中就无需再写dao的实现类
