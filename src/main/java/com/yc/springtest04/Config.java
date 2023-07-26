package com.yc.springtest04;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource(value = "classpath:db.properties")//spring启动时  PropertySource 类扫描 clsspath:db.properties
                                                  //以键值对存
public class Config {
}
