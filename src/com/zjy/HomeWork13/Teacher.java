package com.zjy.HomeWork13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("工龄："+work_age+"\n"+"我承诺，我会认真教课。");
    }
    public String play(){
        return super.play()+"象棋";
    }
    public void print(){
        System.out.println("教师信息：");
        super.print();
        teach();
        System.out.println(play());

    }
}
