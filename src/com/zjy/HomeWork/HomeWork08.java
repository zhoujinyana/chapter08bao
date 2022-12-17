package com.zjy.HomeWork;

public class HomeWork08 {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());


    }
}
class BankAccount{
    private int balance;
    public BankAccount(int initialBalance){
        this.balance = initialBalance;
    }
    //存款
    public void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//存款收取1美元
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
class SavingsAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(int initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount + 1);
        }
        count--;
    }
    public void earnMonthlyInterest(){
        count = 3;
        super.deposit(getBalance()*rate);
    }
}
