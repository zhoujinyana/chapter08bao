package com.edu.houserent.service;

import com.edu.houserent.model.House;

public class HouseService {
    private House[] house;
    private int houseNums = 1;
    private int idCount =  1;
    public HouseService(int size){
        house = new House[size];
        house[0] = new House(1,"jack","112","海定区",2000,"未出租");

    }
    public boolean add(House newHouse){
        if(houseNums == house.length){
            System.out.println("不能继续添加");
            return false;
        }
        house[houseNums++] = newHouse;
        idCount++;
        newHouse.setId(idCount);
        return true;

    }
    public boolean del(int id){
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(id == house[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        for (int i = index; i < houseNums-1; i++) {
            house[i] = house[i+1];

        }
        house[--houseNums] = null;
        return true;
    }
    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if(findId == house[i].getId()){
                return house[i];
            }

        }
        return null;

    }

    public House[] list(){
        return house;
    }

}
