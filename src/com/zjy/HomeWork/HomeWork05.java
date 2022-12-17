package com.zjy.HomeWork;

public class HomeWork05 {
    public static void main(String[] args) {
        Worker worker = new Worker("工人",2000);
        worker.print();
        Peasant peasant = new Peasant("农民",1000);
        peasant.print();
        Teach teach = new Teach("老师",4000);
        teach.setSal(200);
        teach.setDays(30);
        teach.print();
        Waiter waiter = new Waiter("服务员",3500);
        waiter.print();
        Scientist scientist = new Scientist("科学家",6000);
        scientist.setBonus(5000);
        scientist.print();

    }
}
class Work{
    private String category;
    private double salary;

    public Work(String category, double salary) {
        this.category = category;
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void print(){
        System.out.println("类型："+ category + "全年工资："+ salary*12);
    }
}
class Worker extends Work{
    public Worker(String category, double salary) {
        super(category, salary);
    }
    public void print(){
        super.print();
    }

}
class Peasant extends Work{
    public Peasant(String category, double salary) {
        super(category, salary);
    }
    public void print(){
        super.print();
    }
}
class Teach extends Work{
    private double sal;
    private int days;

    public Teach(String category, double salary) {
        super(category, salary);
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void print(){
        System.out.println("类型：" + getCategory() + "全年工资：" + (sal*days+getSalary()*12));
    }
}
class Scientist extends Work{
    private double bonus;

    public Scientist(String category, double salary) {
        super(category, salary);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void print(){
        System.out.println("类型：" + getCategory() + "全年工资：" + (bonus + getSalary()*12));
    }
}
class Waiter extends Work{
    public Waiter(String category, double salary) {
        super(category, salary);
    }
    public void print(){
        super.print();
    }
}