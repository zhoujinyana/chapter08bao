package com.zjy.extend_;

public class PC extends Computer{
    private String brand;

    public PC(String CPU, int save, int disk, String brand) {//继承设计基本思想，父类构造器完成父类属性初始化，子类完成子类的
        super(CPU, save, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println(getDetails()+"brand:"+brand);
    }
}
