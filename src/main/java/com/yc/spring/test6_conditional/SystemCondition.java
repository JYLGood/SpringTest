package com.yc.spring.test6_conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SystemCondition implements Condition {
    /**
     * 匹配方法： 看操作系统  <-  Environment <- spring容器
     * 回调方法  <-  容器
     * @param context
     * @param metadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //Environment  :  jdk: System.getEnv();
        Environment evn=context.getEnvironment();

        //系统变量  os.name=windows
        //命令参数  os.name=Linux
        //程序
        //上三行优先级从上到下逐渐升高

        String oname=evn.getProperty("os.name");
        System.out.println( evn.getProperty("user.dir"));
        System.out.println( evn.getProperty("user.home"));
        if (oname.contains("MacOS")){
            return true;
        }
        return false;
    }
}
