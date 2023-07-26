package com.yc.springtest03.user;

import com.yc.springtest03.system.ContainerFilter;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * bmi筛选器
 */
@Component("bmiFilter")
public class StudentBmiFilter implements ContainerFilter {
    Logger logger=Logger.getLogger("StudentBmiFilter.class");
    @Override
    public boolean doFilter(Object obj) {
        if (obj==null){
            return false;
        }
        if (!(obj instanceof Student)){
            return false;
        }
        Student s=(Student) obj;
        if (s.getName()==null||"".equalsIgnoreCase(s.getName())){
            return false;
        }
        if (s.getHeight()<1||s.getHeight()>2.7){
            logger.error("身高数据异常"+obj.toString());
            //System.out.println("身高数据异常"+obj.toString());
            return false;
        }
        if (s.getWeight()<30||s.getWeight()>500){
            logger.error("体重数据异常"+obj.toString());
            //System.out.println("体重数据异常"+obj.toString());
            return false;
        }
        return true;
    }
}
