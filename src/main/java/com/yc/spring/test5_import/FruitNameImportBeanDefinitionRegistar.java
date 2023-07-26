package com.yc.spring.test5_import;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 需求：根据条件（是否已经加载好了Pear,判断是否加载  Grape容器，且指定beanid）
 */
public class FruitNameImportBeanDefinitionRegistar implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param ingClassMetadata   当前的注解
     * @param registry   已经注册好的bean容器
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata ingClassMetadata, BeanDefinitionRegistry registry) {
        //先判断是否已经有了 Pear加载到容器
        boolean bean=registry.containsBeanDefinition("com.yc.test3.Pear");
        //如果有，再创建Group Bean架子啊到容器
        if (bean){
            RootBeanDefinition d=new RootBeanDefinition(Grape.class);
            //并指定键为  grape
            registry.registerBeanDefinition("grape",d);
        }
    }
}
