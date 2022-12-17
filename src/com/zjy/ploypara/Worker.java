package com.zjy.ploypara;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + " is working");
    }

    public double getAnnual() {//因为普通员工没有其它收入，则直接调用父类方满
        return super.getAnnual();
    }
}