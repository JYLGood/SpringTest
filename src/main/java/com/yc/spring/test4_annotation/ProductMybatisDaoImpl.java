package com.yc.spring.test4_annotation;

import org.springframework.stereotype.Repository;

@Repository  //表明这个类被spring托管  这个类是一个dao层的类 -> spring会将异常转为 RuntimeException
public class ProductMybatisDaoImpl implements ProductDao{

    public ProductMybatisDaoImpl(){
        System.out.println("ProductMybatisDaoImpl构造了");
    }
    @Override
    public void add() {
        System.out.println("ProductMybatisDaoImpl的add()" );
    }

    @Override
    public void find() {
        System.out.println("ProductMybatisDaoImpl的find()");
    }

    @Override
    public void update() {
        System.out.println("ProductMybatisDaoImpl的update()");
    }
}
