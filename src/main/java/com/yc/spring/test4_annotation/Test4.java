package com.yc.spring.test4_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig_Test4.class);

        ProductBiz pb=(ProductBiz) ac.getBean("productBizImpl");  //beanid的约定是：类名的首字母小写
        pb.takein();
    }
}
