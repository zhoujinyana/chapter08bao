package com.zjy.HomeWork13;


public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.print("姓名："+name+"\n"+"年龄："+age+"\n"+"性别："+gender+"\n");
    }

    public String play(){
        return name+"爱玩";
    }
   public static void bubble(Person[] person){
        Person temp = null;
        for(int i = 0; i < person.length -1; i++){
            for(int j = 0; j < person.length -1 -i; j++){
                if(person[j].age < person[j+1].age){
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;

                }
            }
        }
   }

    public static void test(Person person){
        if(person instanceof Student){
            ((Student) person).study();
        }else if(person instanceof Teacher){
            ((Teacher) person).teach();
        }else{
            System.out.println("nothing");
        }
    }

    public static void main(String[] args) {//main本来是static类的方法，调用的方法必须为static

        Person[] person = new Person[4];
        person[0] = new Student("jack",'男',12,"000123");
        person[1] = new Student("merry",'女',13,"000124");
        person[2] = new Teacher("老韩",'男',30,5);
        person[3] = new Teacher("Ben",'男',35,7);

        bubble(person);
        for(int i = 0; i < person.length; i++){
            System.out.println(person[i].age);
        }
        for (int i = 0; i < person.length; i++) {
            test(person[i]);
        }


    }

}
