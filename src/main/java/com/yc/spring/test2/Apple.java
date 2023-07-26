package com.yc.spring.test2;

public class Apple {
    private int id;

    public  Apple(){
        System.out.println("Apple构造了");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                '}';
    }
}
