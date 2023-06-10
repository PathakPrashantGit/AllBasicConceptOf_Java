package SCANNER;

import java.util.Scanner;

public class Basic {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the values of a :- ");
		 int a = sc.nextInt();
		 System.out.print("Enter the values of b :- ");
		 int b = sc.nextInt();
		 System.out.print("Multiplication of " +a+ " and " +b+ " is = ");
		  
		 int c = a*b;
		 System.out.println(c);
		 
		 
		 
	}

}
