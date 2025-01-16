import java.util.*;

//creating the PalindromeChecker class
class PalindromeChecker{
    String text;
	
	//method to check string is palindrome or not
    public boolean isPalindrome(String text){
	  int start = 0;
	  int end = text.length()-1;
	  while(start<end){
		if(text.charAt(start) != text.charAt(end)){
		         return false;
		   }
           start++;
           end--;		   
	  }
	       return true;
    }
	//displaying whether the string is palindrome or not
    public void display(String text){
	    this.text = text;
	    if(isPalindrome(text)){
	     System.out.println("The given text is palindrome");
      }	
      else {
	   System.out.println("The given text is not palindrome");
     }	  
  }
  
}
public class Palindrome{
    public static void main(String [] args){
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter the String: ");
	   //taking the string input
	   String text = sc.next();
	   
	   PalindromeChecker obj = new PalindromeChecker();
	   //calling the method
       obj.display(text);	   
	}
}