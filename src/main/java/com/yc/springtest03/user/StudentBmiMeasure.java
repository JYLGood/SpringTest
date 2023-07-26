package com.yc.springtest03.user;

import com.yc.springtest03.system.Measure;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * 学生的bmi指数测量接口
 */
@Component("bmiMeasure")
public class StudentBmiMeasure implements Measure {
    Logger logger=Logger.getLogger("StudentBmiFilter.class");;
    @Override
    public double doMeasure(Object obj) {
        if (obj==null){
            logger.error("待数据异常");
            throw new RuntimeException("待数据异常");
        }
        if (!(obj instanceof Student)){
            logger.error("待数据异常");
            throw new RuntimeException("待数据异常");
        }
        Student s=(Student) obj;
        return s.getWeight()/(s.getHeight()*s.getHeight());
    }
}
