package com.zjy.poly_;

public class polyDetails {
    public static void main(String[] args) {
        BB bb = new BB();
        AA aa = bb;
        //System.out.println(bb instanceof BB);
        System.out.println(aa.count);// 编译类型
        aa.display();//运行类型

    }
}
class AA{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }

}
class BB extends AA{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }

}