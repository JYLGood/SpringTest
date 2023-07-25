package com.yc.springtest01;

import com.yc.springtest01.Biz.UserBiz;
import com.yc.springtest01.Config;
import com.yc.springtest01.dao.UserDaoImpl;
import com.yc.springtest01.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main(String[] args) {
        //首先创建容器
        //ClasspathXmlApplicationContext  类路径下有一个xml文件来配置，来生成容器
        //FileSystemApplicationContext    FileSystem任意路径（c:/...），文件路径下的xml来配置
        //AnnotationConfigApplicationContext  读取注解类（@Configuration）,生成容器
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        //容器中已经创建好了这个类  “键：userDaoImpl”  值：是对象
        UserDao ud=(UserDao) context.getBean("userDaoImpl");
        ud.addUser("张三");

        UserBiz ub=(UserBiz) context.getBean("userBizImpl");
        ub.addUser("王五");

        //////////////////////////////////////////////////以前的方法
        UserDao udd=new UserDaoImpl();
        udd.addUser("李四");
    }
}
