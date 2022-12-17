package com.zjy.polyarr_;

public class Teacher extends Person{
    private double sal;

    public Teacher(String name, int age, double sal) {
        super(name, age);
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public String say(){
        return super.say() + "\t" + sal;
    }
    public void teach(){
        System.out.println("老师"+getName()+"正在上课");
    }
}
