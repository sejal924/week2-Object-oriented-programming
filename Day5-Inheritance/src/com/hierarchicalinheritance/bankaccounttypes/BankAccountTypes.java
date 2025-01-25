package com.hierarchicalinheritance.bankaccounttypes;

public class BankAccountTypes{
    public static void main(String [] args){
        SavingsAccount savingAccount = new SavingsAccount(2564783,245.75,10);
        savingAccount.displayAccountType();

        CheckingAccount checkingAccount = new CheckingAccount(2784783,2152.35,1000);
        checkingAccount.displayAccountType();

        FixedDepositAccount fixedAccount = new FixedDepositAccount(2564783,245.75,14);
        fixedAccount.displayAccountType();
    }
}

