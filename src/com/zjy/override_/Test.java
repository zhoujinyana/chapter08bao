package com.zjy.override_;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("jack",18);
        System.out.println(person.say());
        Student student = new Student("adma",16,001,89);
        System.out.println(student.say());



    }
}
