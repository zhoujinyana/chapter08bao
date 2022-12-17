package com.zjy.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("宝马");
        car = null;
        System.gc();
        System.out.println("xx");


    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name);
    }
}