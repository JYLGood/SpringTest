package com.yc.spring.test5_import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//                pear的托管            Grape的托管（只有Pear托管了，才会托管Grape）
@Import({Banana.class, FruitImportSelector.class, FruitNameImportBeanDefinitionRegistar.class})
public class AppConfig_3 {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig_3.class);
        String[] names=ac.getBeanDefinitionNames();
        for (String s:names){
            System.out.println(s);
        }
    }
}
