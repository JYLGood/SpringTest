package com.yc.spring.test1;

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
       // ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
        //ApplicationContext context = new FileSystemXmlApplicationContext("file://user/jiangyuliang/Desktop/Test/SpringTest");
        //第三种applicationtext
//        Resource res=new ClassPathResource("beans.xml");
//        BeanFactory context=new XmlBeanFactory(res);

        Student ss=(Student) context.getBean("s");
        System.out.println(ss);

        //容器的好处：容器来管理bean， 比如单例
        Student s1=(Student) context.getBean("s");
        Student s2=(Student) context.getBean("s");
        System.out.println(s1.hashCode()+"\t"+s2.hashCode());

        //TODO: 让属性有值： -> DI -> Dependecy injection 依赖注入
    }
}
