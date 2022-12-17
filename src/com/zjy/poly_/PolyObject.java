package com.zjy.poly_;

public class PolyObject {
    public static void main(String[] args) {
        //对象多态
        //编译类型是Animal，运行类型是Dog
        Animal animal = new Dog();
        //animal.cry();
        //animal = new Cat();
        //animal.cry();
        Dog dog = (Dog) animal;
         dog.dogCall();
    }
}
