package com.example.entity;

public class AccountThread extends Thread {

    private Account account;

    @Override
    public void run() {
        super.run();
        account.draw(100);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
