package com.edu.houserent.view;

import java.util.Scanner;

/**
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

   private boolean loop = true;
   private char key = ' ';
   Scanner scanner = new Scanner(System.in);
   public void mainMenu(){
       do{
           System.out.println("-------房屋出租系统菜单-------");
           System.out.println("\t\t\t1 新增房源");
           System.out.println("\t\t\t2 查找房屋");
           System.out.println("\t\t\t3 删除房屋");
           System.out.println("\t\t\t4 修改房屋信息");
           System.out.println("\t\t\t5 房屋列表");
           System.out.println("\t\t\t6 退出");
           System.out.println("请输入你的选择（1-6）");
           key = scanner.next().charAt(0);
           switch(key){
               case '1':
                   System.out.println("新增房源");
                   break;
               case '2':
                   System.out.println("查找房屋");
                   break;
               case '3':
                   System.out.println("删除房屋");
                   break;
               case '4':
                   System.out.println("修改房屋信息");
                   break;
               case '5':
                   System.out.println("房屋列表");
                   break;
               case '6':
                   System.out.println("退出");
                   break;
           }

       }while(loop);
   }
}
