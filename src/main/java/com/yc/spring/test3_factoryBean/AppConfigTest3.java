package com.yc.spring.test3_factoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //配置类
public class AppConfigTest3 {
    @Bean   //FruitFactoryBean被Spring托管
    public FruitFactoryBean ffb(){
        return new FruitFactoryBean();
    }

}
