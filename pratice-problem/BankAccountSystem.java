import java.util.*;

//creating the BankAccount class 
class BankAccount{
	//creating instance variable
    String accountHolderName;
	final long accountNumber;
    static String bankName = "SBI";
	static int totalAccounts =0;
	
	//constructor
	BankAccount(String accountHolderName , long accountNumber){
	        this.accountHolderName = accountHolderName;
			this.accountNumber = accountNumber; 
			totalAccounts++;
	}
	//method to get total number of accounts
	public static int  getTotalAccounts(){
	      return totalAccounts;
	}
	//method to display details
    public  void displayDetails(){
		 //checking whether the obj is an instance of BankAccount 
		if(this instanceof BankAccount){
		System.out.println("--------The bank account details-------");
		System.out.println("The name of the bank is: " + bankName);
		System.out.println("The name of the bank account holder is: " + accountHolderName);
		System.out.println("The bank account number is: " + accountNumber); 
		}
	    else{
		    System.out.println("The account obj is not an instance of the BankAccount");
		}
    }	
}
public class BankAccountSystem{
    public static void main(String [] args){
		//creating object
	    BankAccount account1 = new BankAccount("Naman" , 5643786);
		BankAccount account2 = new BankAccount("Aman" , 3246751);
		//calling methods
		account1.displayDetails();
		account2.displayDetails();
		System.out.println("Total number of the accounts: " + BankAccount.getTotalAccounts());
			
	}
}