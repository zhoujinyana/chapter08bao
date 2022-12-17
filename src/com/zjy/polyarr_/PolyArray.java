package com.zjy.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack",20);
        person[1] = new Student("kendel",20,89);
        person[2] = new Teacher("angle",29,3000);
        for (int i = 0; i < person.length; i++) {
            System.out.println( person[i].say());
            if(person[i] instanceof Student){
                Student student = (Student)person[i];
                student.study();
            }else if(person[i] instanceof Teacher){
                Teacher teacher = (Teacher)person[i];
                teacher.teach();
            }else{
                System.out.println("类型有误");
            }
        }
    }

}
