package com.hierarchicalinheritance.bankaccounttypes;

class BankAccount{
    long accountNumber;
    double balance;

    BankAccount(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void  displayAccountType(){
        System.out.println("---Account Details:---");
        System.out.println("Account number is: " + accountNumber);
        System.out.println("balance in account" + balance);
    }
}
