package BankingApplication;

import java.util.Scanner;

//Entering the BankAccount details and data entered

class BankAccount{
	
	int Balance;
	int PreviousTransaction;
	String CustomerName;
	String CustomerId;

// Customer name and customer id details
	
	
	BankAccount(String cName, String Cid){
		
		CustomerName=cName;
		CustomerId=Cid;
	}
	
//Deposit the amount 
	
	void deposit(int amount) {
		
		Balance=Balance+amount;
		PreviousTransaction=amount;
	}
	
//Withdraw the amount
	
	void withdraw(int amount) {
		
		Balance=Balance+amount;
		PreviousTransaction=-amount;
	}
	
// getPreviousTransaction  
	
	void getPreviousTransaction() {
		
		if(PreviousTransaction > 0) {
			System.out.println("Deposited :" + PreviousTransaction);
		}
		else if(PreviousTransaction < 0)
		{
			System.out.println("Withdraw :" + PreviousTransaction);
		}
		else {
			System.out.println("Invaild option (or) wrong option");
		}
	}
	
// Display the main the enter the options
	
	
	void Menu(){
		   
		       char option='\0';
		       
		       Scanner scr= new Scanner(System.in);
		       
		       System.out.println("username :"+ CustomerName);
		       System.out.println("user id :"+ CustomerId);
		       System.out.println("\n");
		       System.out.println("A. CheckBalance");
		       System.out.println("B. Deposit");
		       System.out.println("C. Withdraw");
		       System.out.println("D. Previous Transaction");
		       System.out.println("E. Exit");
		       
		//Options to display on screen
		       
		       do {
		    	   System.out.println("------------------------------------------------------------------");
		    	   System.out.println("Enter the options");
		    	   System.out.println("------------------------------------------------------------------");
		    	   option=scr.next().charAt(0);
		    	   System.out.println("\0");
		    	
		  //options to check the balance
		    	   
		    	   switch(option) {
		    	   
		    	   case  'A' :
		    		   System.out.println("---------------------------------------------------------------");
		    		   System.out.println("Balance"+ Balance);
		    		   System.out.println("----------------------------------------------------------------");
		    		   System.out.println("\n");
		    		   break;
		    		   
		   //option to check the deposit in the account
		    		   
		    	   case  'B'  :
		    		   System.out.println("----------------------------------------------------------------");
		    		   System.out.println("Enter the Deposit amount :");
		    		   System.out.println("----------------------------------------------------------------");
		    		   int amount=scr.nextInt();
		    		   deposit(amount);
		    		   System.out.println("\n");
		    		   break;
		    		   
		 //option to withdrawn the amount for the account
		    		   
		    	   case  'C'  :
		    		   System.out.println("-----------------------------------------------------------------");
		    		   System.out.println("Enter the withdraw amount");
		    		   System.out.println("-----------------------------------------------------------------");
		    		   int amount1=scr.nextInt();
		    		   withdraw(-amount1);
		               System.out.println("\n");
		               break;
		               
		 //option to Transaction of amount for the account
		               
		    	   case  'D'  :
		    		   System.out.println("------------------------------------------------------------------");
		    		   getPreviousTransaction();
		    		   System.out.println("------------------------------------------------------------------");
		    		   System.out.println("\n");
		    		   break;
		    		   
		 //option to exit for the transaction
		    		   
		    	   case   'E'  :
		    		   
		    		   System.out.println("------------------------------------------------------------------");
		    		   break;
		    		   
		    		   default :
		    			   System.out.println("Invaild input(or) wrong option");
		    			   
		    			   
		    	   }
		       }
		       
		       while(option != 'E');
		       System.out.println("Thank for ur's services");
		       
		       		
		    		   
		    	   }
		     }

public class Banking1{
	
	public static void main(String[] args) {
		
	//	Details the enter of the banking
		
		BankAccount obj= new BankAccount("RajiLakshmi Madduri","10221003567890");
		obj.Menu();
		
	}
	}
	
