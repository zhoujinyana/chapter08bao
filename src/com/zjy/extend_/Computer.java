package com.zjy.extend_;

public class Computer {
    private String CPU;
    private int save;
    private int disk;
    public Computer(String CPU,int save,int disk){
        this.CPU = CPU;
        this.save = save;
        this.disk = disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getDetails(){
        return "cpu:"+CPU  + "内存:"+save + "硬盘:"+disk;
    }
}
