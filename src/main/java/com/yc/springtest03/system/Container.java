package com.yc.springtest03.system;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *     1. 能存大量对象( 大学生Bmi |...)  => 集合
 *     2. 测量的接口     => 具体怎么测，由用户决定
 *     3. 筛选的接口    =>  具体怎么筛选，由用户决定.
 *     4. 返回最大值对象，最小值对象....
 * @param <T>
 */
@Component
public class Container<T> {
    private List<T> objs=new ArrayList<T>();

//    方案一
    @Resource(name = "bmiMeasure")
//    方案二
//    @Autowired
//    @Qualifier(value = "bmiMeasure")
    private Measure measure;
    @Resource(name = "bmiFilter")
    private ContainerFilter filter;

    private T max;
    private T min;
    private double avg;
    private double sum;

    /**
     * 添加对象的方法
     * @param t
     */
    public void add(T t){
        //判断t是否 合格 调用筛选实现
        if (filter!=null){
            if (filter.doFilter(t)==false){
                return;
            }
        }
        //添加到objs
        objs.add(t);
        //判断大小  记录max，min ，计算avg    =>  调用  measure的实现
        if (objs.size()==1){
            max=t;
            min=t;
        }else {
            //侧出值 判断大小
            double val=this.measure.doMeasure(t);
            double maxval=this.measure.doMeasure(max);
            double minval=this.measure.doMeasure(min);
            if (val>maxval){
                max=t;
            }
            if (val<minval){
                min=t;
            }
        }
        sum+= measure.doMeasure(t);
        avg=sum/ objs.size();
    }

    public T getMax() {
        return max;
    }

    public T getMin() {
        return min;
    }

    public double getAvg() {
        return avg;
    }

    /**
     * 有效的测量 对象有多少个
     * @return
     */
    public int size(){
        return objs.size();
    }

    /**
     * 系统复位
     */
    public void clearAll(){
        objs=new ArrayList<T>();
        measure=null;
        filter=null;
        max=null;
        min=null;
        avg=0;
    }
}
