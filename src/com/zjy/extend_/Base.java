package com.zjy.extend_;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("Base()....");
    }
    public int getN4(){//父类提供方法返回n4，这样其他类就可以访问到私有属性n4
        return n4;
    }

    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");

    }
    private void test400(){
        System.out.println("test400");
    }
    public void call(){
        test400();
    }
}

