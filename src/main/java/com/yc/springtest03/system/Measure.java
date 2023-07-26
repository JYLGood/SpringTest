package com.yc.springtest03.system;

/**
 * 测量 接口
 */
public interface Measure {
    /**
     *
     * @param obj   带测量的对象
     * @return  ： 测量的值
     */
    public double doMeasure(Object obj);
}
