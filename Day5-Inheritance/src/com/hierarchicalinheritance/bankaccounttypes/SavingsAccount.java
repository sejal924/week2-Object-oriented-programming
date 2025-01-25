package com.hierarchicalinheritance.bankaccounttypes;

class SavingsAccount extends BankAccount{
    double interestRate;

    SavingsAccount(long accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    public void  displayAccountType(){
        super.displayAccountType();
        System.out.println("The type of bank account is SavingsAccount");
        System.out.println("The rate of interest is " +	interestRate);
    }
}