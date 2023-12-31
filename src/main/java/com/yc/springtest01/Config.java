package com.yc.springtest01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@Configuration  //此类是一个配置类（这个类也会被spring创建），声明容器运行时的配置信息（1.扫面这个路径，这个路径所有带有@Component）
//spring托管
@ComponentScan(basePackages = {"com.yc.springtest01"})//包扫描
public class Config {
}
