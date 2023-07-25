package com.yc.springtest01.Biz;

import com.yc.springtest01.Biz.UserBiz;
import com.yc.springtest01.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements UserBiz {
    //IOC由容器来构造对象  DI来管理
    //将dao层的对象注入到biz  DI依赖注入（将Spring容器中托管的userDao的对象传到此处）
    //@Resource(name="userDaoImpl")  //由spring容器根据  id 名为userDaoImpl到容器中找到这个实例，并注入
    @Autowired //根据类型来完成注入,在spring容器中根据UserDao接口来找实例
    @Qualifier("userDaoImpl")//如果确定容器中只有一个这个对象可以不要此句
    private UserDao userDao;

    @Override
    public void addUser(String name) {
        userDao.addUser(name);
    }

}
