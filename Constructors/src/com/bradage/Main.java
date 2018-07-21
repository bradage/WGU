package com.bradage;

public class Main {

    public static void main(String[] args) {
        BAccount Acct = new BAccount();

        //Account
        Acct.setAccountNumber(55556651);
        System.out.println("The account Number is " + Acct.getAccountNumber());

        Acct.setAccountNumber((555555555));
        System.out.println("The Account Number is now " + Acct.getAccountNumber());

        //Balance
        Acct.setBalance(1466.66d);
        System.out.println("Your current balance is " + Acct.getBalance());

        //Customer
        Acct.setCustomer("John Smith");
        System.out.println("The Customer Name is " + Acct.getCustomer());

        //Email
        Acct.setEmail("Myemail@fake.com");
        System.out.println("The customer's email is " + Acct.getEmail());

        // Phone
        Acct.setPhoneNumber("(435) 890 - 3609");
        System.out.println("The customer's Phone Number is " + Acct.getPhoneNumber());


        //Deposit
        Acct.depositFunds(200.00d);

        //Withdraw
        Acct.withdrawFunds(1800.25d);
        Acct.withdrawFunds(300.00d);

    }
}
