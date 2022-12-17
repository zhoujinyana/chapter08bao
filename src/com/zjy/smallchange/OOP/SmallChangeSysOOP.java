package com.zjy.smallchange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//面向对象编程
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "-------零钱通明细-------";

    double money = 0;
    double balance = 0;
    Date date = null;
    String note = "";
    String choice = "";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void mainMenu(){
        do{
            System.out.println("\n-------零钱通菜单(oop)-------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.print("请选择（1-4）");
            key = scanner.next();
            //使用switch判断
            switch(key) {
                case "1":
                    this.details();
                    break;
                case "2":
                     this.income();
                     break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;

                default:
                    System.out.println("输入的菜单有误，请重新输入");

            }

        }while(loop);
        System.out.println("-------退出了零钱通项目-------");
    }
    public void details(){
        System.out.println(details);
    }
    public void income(){
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        //找出不正确的金额，直接退出
        if(money <= 0){
            System.out.println("收益入账金额范围需要大于0");
            return;//退出该方法，不再执行后边的代码
        }

        balance += money;
        date = new Date();//获取当前日期
        details += "\n收益入账\t+" + money +"\t" + sdf.format(date) +"\t"+ "余额\t"+balance ;
    }
    public void pay(){
        System.out.println("消费金额：");
        money = scanner.nextDouble();

        if(money <= 0 || money > balance){
            System.out.println("消费金额不正确");
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note+"\t-"+money +"\t" + sdf.format(date) +"\t"+ "余额\t"+balance ;

    }
    public void exit(){
        while(true){
            System.out.println("确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if(choice.equals("y")){
            loop = false;
        }

    }
}
