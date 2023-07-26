package com.yc.spring.test3_factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试  FactoryBean的使用
 */
public class Test {
    public static void main(String[] args) {
        //1.创建容器
        //容器启动： ->  FruitFactoryBean
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfigTest3.class);
        Object obj1=ac.getBean("ffb"); // beanid ffb -> pear产品对象
        System.out.println(obj1);

        Object obj2=ac.getBean("&ffb"); // beanid &ffb -> 工厂bean
        System.out.println(obj2);

        //2.pear是单例or多例
        obj1=ac.getBean("ffb"); // beanid ffb -> pear产品对象
        System.out.println(obj1.hashCode());

        //3. 获取spring容器中所有托管的bean
        String [] beanNames=ac.getBeanDefinitionNames();
        for (String bn:beanNames){
            System.out.println(bn);
        }
    }
}
