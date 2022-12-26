package com.edu.houserent.view;

import com.edu.houserent.model.House;
import com.edu.houserent.service.HouseService;

import java.util.Scanner;

/**
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

   private boolean loop = true;
   private char key = ' ';
   private HouseService houseService = new HouseService(10);
   Scanner scanner = new Scanner(System.in);
   public void listHouse(){
       System.out.println("-------房屋列表-------");
       System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
       House[] house = houseService.list();
       for (int i = 0; i < house.length; i++) {
           if(house[i] == null){
               break;
           }
           System.out.println(house[i]);
       }
       System.out.println("房屋列表显示完毕");

   }
   public void addHouse(){
       System.out.println("-------添加房屋-------");
       System.out.println("姓名：");
       String name = scanner.next();
       System.out.println("电话：");
       String phone = scanner.next();
       System.out.println("地址：");
       String address = scanner.next();
       System.out.println("月租：");
       int rent = scanner.nextInt();
       System.out.println("状态：");
       String state = scanner.next();
       House newHouse = new House(0, name, phone, address, rent, state);
       if(houseService.add(newHouse)){
           System.out.println("-------添加房屋成功-------");
       }else{
           System.out.println("-------添加房屋失败-------");
       }

   }
   public void deleteHouse(){
       System.out.println("-------删除房屋-------");
       System.out.println("请输入删除房屋编号：");
       int id = scanner.nextInt();
       if(id == -1){
           System.out.println("放弃删除");
           return;
       }
       System.out.println("确认是否删除");
       char c = scanner.next().charAt(0);;
       if(c == 'y'){
           if(houseService.del(id)){
               System.out.println("删除成功");
           }else{
               System.out.println("删除标号不存在");
           }
       }else{
           System.out.println("放弃删除");
       }


   }
   public void findHouse(){
       System.out.println("-------查找房屋-------");
       System.out.println("请输入查找房屋编号：");
       int findId = scanner.nextInt();
      House house =  houseService.findById(findId);
      if(house != null){
          System.out.println(house);
      }else{
          System.out.println("未找到");
      }


   }
   public void updateHouse(){
       System.out.println("-------修改房屋-------");
       System.out.println("请输入修改房屋编号：");
       int updateId = scanner.nextInt();
       if(updateId == -1){
           System.out.println("放弃修改");
           return;
       }
       House house = houseService.findById(updateId);
       if(house == null){
           System.out.println("不存在");
           return;
       }
       System.out.println("姓名："+house.getName());
       String name = scanner.next();
       if(!"".equals(name)){
           house.setName(name);
       }
       System.out.println("电话："+house.getPhone());
       String phone = scanner.next();
       if(!"".equals(phone)){
           house.setPhone(phone);
       }


   }
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
                   addHouse();
                   break;
               case '2':
                   findHouse();
                   break;
               case '3':
                   deleteHouse();
                   break;
               case '4':
                   updateHouse();
                   break;
               case '5':
                   listHouse();
                   break;
               case '6':
                   System.out.println("退出");
                   loop = false;
           }

       }while(loop);
   }
}
