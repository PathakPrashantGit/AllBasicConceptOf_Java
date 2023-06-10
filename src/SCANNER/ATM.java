package SCANNER;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Please enter  Your pint :- ");
		 int pin = sc.nextInt();
		 
		 if(pin == 1026)
		 {
			 System.out.print("Enter Amount :- ");
			 int Amount = sc.nextInt();
			 if(Amount%100==0)
			 {
				 System.out.println("Transaction Processing");
			 }
			 else
			 {
				 System.out.println("please enter amount divisible of 100 ");
			 }
			 
		 }
		 else
		 {
			 System.out.println("Please enter valid pin Number");
		 }
		 
		
	}

}
