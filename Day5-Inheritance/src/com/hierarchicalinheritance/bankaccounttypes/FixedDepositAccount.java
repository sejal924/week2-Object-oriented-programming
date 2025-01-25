package com.hierarchicalinheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount{
    double interestRate;
    FixedDepositAccount(long accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    public void  displayAccountType(){
        super.displayAccountType();
        System.out.println("The type of bank account is FixedDepositAccount");
        System.out.println("The rate of interest is " +	interestRate);
    }
}