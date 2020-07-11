package com.hj.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * 1.  implements Serializable:继承了serializable 就是表示这bai个类可以序du列化
 *      -> 使用bai序列化保存数据比直接写在du文件zhi里更有安全性 而且读dao取的时候处理也简单
 *      -> 还有一个更重要的用途就是在rmi和ejb使用的时候 作为参数传递的对象必须是serializable的
 */

public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
