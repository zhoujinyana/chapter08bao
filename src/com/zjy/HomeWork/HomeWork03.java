package com.zjy.HomeWork;

public class HomeWork03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("jack",25,"professor",2500,1.5);
        teacher.introduce();


    }
}
class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", grade=" + grade ;
    }

    public void introduce(){
        System.out.println(toString());
    }
}
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(){
        super.introduce();

    }
}
class asProfessor extends Teacher{
    public asProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(){
        super.introduce();

    }
}
class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(Lecturer lecturer){
        super.introduce();

    }
}