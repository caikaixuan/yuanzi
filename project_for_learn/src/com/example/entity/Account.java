package com.example.entity;

public class Account {

    private long accountNo;

    private int accountBalance;

    public Account(long accountNo, int accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public synchronized void draw(int balance){
        try {
            Thread.sleep(5 * 1000);
            System.out.println("draw done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
