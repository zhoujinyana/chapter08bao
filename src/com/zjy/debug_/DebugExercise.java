package com.zjy.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        //加载，初始化，显示初始化，返回对象地址
        Person person = new Person("jack",20);
        System.out.println(person);
    }
}
class Person{
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
