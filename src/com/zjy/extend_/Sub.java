package com.zjy.extend_;

public class Sub extends Base{
    public Sub(){
        System.out.println("sub()...");
    }
    public void sayOK(){
        System.out.println(n1 +" "+ n2 +" " + n3);
        test100();
        test200();
        test300();
        System.out.println("n4=" + getN4());
        call();

    }
}
