package com.zjy.HomeWork;

import java.security.PrivateKey;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack",20,"teacher");
        person[1] = new Person("tom",18,"student");
        person[2] = new Person("lily",26,"police");
        Person temp = null;//注意类型
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if(person[j].getAge() < person[j+1].getAge()){
                    temp = person[j];
                    person[j] = person[j+1];//交换位置，而不是单纯的数字交换
                    person[j+1] = temp;//必须为变量才可以比较
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getAge());

        }
    }
}
class Person{

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}