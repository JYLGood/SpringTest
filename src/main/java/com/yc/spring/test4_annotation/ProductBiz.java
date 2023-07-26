package com.yc.spring.test4_annotation;

public interface ProductBiz {
    /**
     * 入库   1.先查find()    2.再添加(a加数量update()  b增加add())
     */
    public void takein();
}
