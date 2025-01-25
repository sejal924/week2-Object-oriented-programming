package com.hierarchicalinheritance.bankaccounttypes;

class CheckingAccount extends BankAccount{
    int withdrawalLimit ;

    CheckingAccount(long accountNumber,double balance,int withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    public void  displayAccountType(){
        super.displayAccountType();
        System.out.println("The type of bank account is CheckingAccount");
        System.out.println("The money withdraw limit is " +	withdrawalLimit);
    }
}
