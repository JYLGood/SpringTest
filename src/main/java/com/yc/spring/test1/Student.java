package com.yc.spring.test1;

public class Student {
    private int id;
    private String name;

    public Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student() {
        System.out.println("Student  构造了");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setID:"+id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName:"+name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
