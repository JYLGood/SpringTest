package com.yc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        //1.早期的程序
        Student s=new Student();
        s.setId(1);
        s.setName("张三");
        System.out.println(s.toString());
        //小结：这叫控制不反转，程序来创建对象  test1依赖与Student 的

        //2.引入Spring的IOC机制
        //  IOC 控制反转   由spring来创建对象Student
        //      ClassPathXmlApplicationContext  类路径下的 xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //上面这句： 启动容器 读取class路径下的beans.xml 文件  并获取bean配置的class  实例化对象  存到容器中

        Student ss=(Student) context.getBean("s");
        System.out.println(ss);

        //TODO: 让属性有值： -> DI -> Dependecy injection 依赖注入
    }
}
