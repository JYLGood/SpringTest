package com.yc.spring.test5_import;

import com.yc.spring.test3_factoryBean.Pear;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class FruitImportSelector implements ImportSelector {
    @Override  //回调
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //TODO:  扫描一些jar包  配置文件  -》  指定第三方的类的路径
        return new String [] {Pear.class.getName()};
    }
}
