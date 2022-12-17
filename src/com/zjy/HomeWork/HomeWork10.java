package com.zjy.HomeWork;

import javax.print.Doc;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jack",25,"护士",'男',5000);
        Doctor doctor1 = new Doctor("jack",25,"护士",'女',5000);

        System.out.println(doctor.equals(doctor1));

    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public boolean equals(Object obj){
        if(this == obj){//是不是本身
            return true;
        }
        if(!(obj instanceof Doctor)){//是不是子类
            return false;
        }
        Doctor doctor = (Doctor)obj;//向下转型
        return this.name.equals(doctor.name) && this.age == doctor.age && this.gender == doctor.gender && this.job.equals(doctor.job) && this.sal == doctor.sal;

    }
}