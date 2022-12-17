package com.zjy.extend_;

public class ExtendsTheory {
    //继承的本质
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);//按照查找关系返回信息，首先看子类是否有这个属性，有则返回子类信息
        //如果子类没有，就看父类，如果父类有并且可以访问，就返回信息，直到object
        System.out.println(son.getAge());
        System.out.println(son.hobby);

    }
}
class Grandpa{//爷类
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends Grandpa{//父类
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}
class Son extends Father{//子类
    String name = "大头儿子";
}