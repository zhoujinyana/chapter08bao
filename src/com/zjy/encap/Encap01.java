package com.zjy.encap;

public class Encap01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(20);
        person.setSalary(30000);
        System.out.println(person.info());

    }

}
class Person{
    public String name;
    private int age;
    private double salary;
    public Person(){}
    public Person(String name,int age,double salary){
        this.setName(name);//this可以不写
        this.setAge(age);
        this.setSalary(salary);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else{
            System.out.println("姓名输入不合规定,给默认名字");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 1 && age < 120) {
            this.age = age;
        }else{
            System.out.println("年龄需要在1-120,给默认年龄18");
            this.age = 18;
        }
    }

    public double getSalary() {
        //可以增加查看权限
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "姓名："+ name+"年龄:"+age+ "工资:"+salary;
    }
}