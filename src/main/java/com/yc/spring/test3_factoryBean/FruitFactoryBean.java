package com.yc.spring.test3_factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class FruitFactoryBean implements FactoryBean<Pear> {

    public FruitFactoryBean(){
        System.out.println("FruitFactoryBean构造了");
    }
    @Override
    public Pear getObject() throws Exception {
        //加入逻辑
        return new Pear();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
