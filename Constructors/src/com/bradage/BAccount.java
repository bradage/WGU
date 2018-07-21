package com.bradage;

public class BAccount {

    private int accountNumber;
    private double balance;
    private String customer;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        balance += amount;
        System.out.println("yout current balance is now " + balance);
    }

    public void withdrawFunds(double amount){
        if(balance - amount < 0) {
            System.out.println("There are insufficient funds to complete this transaction.");
        } else {
            balance -= amount;
            System.out.println("yout current balance is now " + balance);
        }
    }
}
