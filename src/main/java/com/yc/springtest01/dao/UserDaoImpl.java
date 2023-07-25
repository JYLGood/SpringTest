package com.yc.springtest01.dao;

import com.yc.springtest01.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository   //@Repository注解标识这是一个dao层的类  由spring托管
                //@Component                      由spring托管
public class UserDaoImpl implements UserDao {
    public UserDaoImpl(){
        System.out.println("UserDaoImpl构造方法");
    }

    @Override
    public void addUser(String uname) {
        System.out.println("添加了:"+uname);
    }
}
