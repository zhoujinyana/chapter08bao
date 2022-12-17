package com.zjy.extend_;

public class NotePad extends Computer{
    String color;

    public NotePad(String CPU, int save, int disk, String color) {
        super(CPU, save, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.println(getDetails()+"color:"+color);
    }
}
