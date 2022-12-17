package com.zjy.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(200);
        account.setPassword("123456");
        account.info();
    }
}
class Account {
    private String name;
    private double balance;
    private String password;
    public Account(){}

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if (len == 3 || len == 4 || len == 5) {
            this.name = name;
        } else {
            System.out.println("长度不符合要求");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额不足");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int len = password.length();
        if (len == 6) {
            this.password = password;
        }else{
            System.out.println("密码长度不符合");
        }
    }
    public void info(){
        System.out.println("姓名："+ name+"余额:"+balance+ "密码:"+password);
    }
}