import java.util.*;

//creating BankAccount class
class BankAccount{
    String accountHolderName;
	long accountNumber;
	double balance;
	
	//constructor
    BankAccount(String accountHolderName, long accountNumber, double balance){
	    this.accountHolderName= accountHolderName;
		this.accountNumber = accountNumber;
        this.balance = balance; 		
	}
	//method to add deposit money
	public void depositMoney(double money){
		  balance += money;
	}
	//method to withdraw money
	public void withdrawMoney(double amount){
		  if(amount <= balance){
			   balance -=amount;
		  }
	}
	//method to display current balance
	public void currentBalance(){
	    System.out.println("Current balance is: " + balance);
	}
}
public class ATM{
    public static void main(String[] args){
	    BankAccount check = new BankAccount("Ram", 3689452, 2486.45);
		//calling methods
		check.depositMoney(2000);
		check.withdrawMoney(5000);
		check.currentBalance();
	}
}