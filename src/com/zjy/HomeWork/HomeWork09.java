package com.zjy.HomeWork;

public class HomeWork09 {
    public static void main(String[] args) {
        Point point = new Point("Black",1929,230.07);

    }
}
class Point{
    private double x;
    private double y;
    private String label;

    public Point(String label, double x, double y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}