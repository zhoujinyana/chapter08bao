package com.zjy.HomeWork;

public class HomeWork04 {
    public static void main(String[] args) {
        Staff staff = new Staff("jack",50,28,1.0);
        staff.print();
        Manager manager = new Manager("lily",100,25,1.5);
        manager.setBonus(1000);
        manager.print();
    }

}
class Employee{
    private String name;
    private double salary;
    private int day;
    private double grade;

    public Employee(String name, double salary, int day, double grade) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.grade = grade;
    }
    public void print(){
        System.out.println(salary*day*grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
class Staff extends Employee{

    public Staff(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }



    public void print(){
//        double sal = getSalary()*getDay()*getGrade();
//        System.out.println(sal);
        super.print();//复用代码
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void print(){
        System.out.println(bonus + getSalary()*getDay()*getGrade());
    }
}