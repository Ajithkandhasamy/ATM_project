
import java.util.*;

public class Atm {
     public static void main(String[]args) {
    	 
    	 int pin=9876;  //ATM pin number
    	
    	 int Balance=1000;  //Bank Balance
    	 int addAmount=0;   
    	 int takeAmount=0;
    	 int select,con;
    	 
    	 
    	 //Scanner Function
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter pin number");
    	 int pw=scan.nextInt();
    	 if(pw==pin) {
    	while(true) {
    	 System.out.println("press 1 check your balance");
    	 System.out.println("press 2 add amount");
    	 System.out.println("press 3 to take amount");
    	 System.out.println("press 4 to take resipt");
    	 System.out.println("press 5 exit");
    	 
    	 select=scan.nextInt();
    	 
    	 switch(select) {
    	 
    	         //check balance
    	 case 1:
    		 System.out.println("current balance = "+Balance);
    		  break;   
    		    //deposit amount
    	 case 2:
    		 System.out.println("enter add amount");
    		 int addamount=scan.nextInt();
    		 System.out.println("aSuccessfully dded amount ="+addamount);
    		 Balance=addamount+Balance;
    		 System.out.println("Balance amount            ="+Balance);
    		 break;
    		    //Withdraw
    	 case 3:
    		 System.out.println("enter Take amount");
    		 takeAmount=scan.nextInt();
    		 if(Balance>takeAmount) {
    		 System.out.println("widhdraw amount ="+takeAmount);
    		 Balance=Balance-takeAmount;
    		 System.out.println("Balance amount  ="+Balance);
    		 }
    		 else {
    			 System.err.println("insufficient balance");
    			 System.out.println("Your Balance is ="+Balance);
    			
    		 }
    		 break;
    		 
    		     //take resipt
    	 case 4:
    		 System.out.println("Welcome to Banana ATM");
			 System.out.println("Available balance is ="+Balance);
			 System.out.println("Amount deposite      ="+addAmount);
			 System.out.println("Amount taken         ="+takeAmount);
			 System.out.println("Thanks for coming");
			 break;
		
    	 }
    	if(select==5) {
    		System.out.println("Thanks for coming");
       	    break;
    	}
   }
    	 } 
    	 else {
    		 System.err.println("Enter your valid pin number");
    	 }
}
}
