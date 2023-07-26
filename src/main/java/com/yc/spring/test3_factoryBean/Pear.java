package com.yc.spring.test3_factoryBean;

public class Pear {
    private int id;

    public Pear() {
        System.out.println("Pear的构造方法....");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "id=" + id +
                '}';
    }
}
