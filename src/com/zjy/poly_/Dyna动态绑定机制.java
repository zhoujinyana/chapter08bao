package com.zjy.poly_;

public class Dyna动态绑定机制 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());//40----30
        System.out.println(a.sum1());//30----20

    }
}
class A {//父类
    public int i = 10;
    public int sum(){
        return getI() + 10;//getI()调用B中的getI，运行类型，动态绑定机制
    }
        public int sum1(){

        return i+ 10;//i调用A中的i
    }
        public int getI(){
        return i;
        }
}
class B extends A {//子类
     public int i = 20;
//     public int sum() {
//         return i+ 20;
//     }
        public int getI() {
         return i;
        }
//    public int sum1(){
//        return i+ 10;
//    }
}
