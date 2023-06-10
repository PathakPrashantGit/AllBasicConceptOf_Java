package METHODD;

public class PK3 {
	
	// find the odd and even number
	
	public  void Ankush (int i) // non sttatic method
	{
	
	
		for(int a = 1; a<=i; a++)
		{
			if (a%2==0)
			{
				System.out.println(a+ " = is the even Number");
			}
			else
			{
				System.out.println(a+ " = is the odd Number");
			}
			
		}
		System.out.println();
	}
	
	public static void Kale(int b)
	{
		for(int c =2000; c<=b; c++)
		{
			if(c%4==0)
			{
				System.out.println(c+ " = is leap year");
			}
			else
			{
				System.out.println(c+ " = is not leap year");
			}
		}
		
	}
	
	public static void main (String[] args)
	{
		PK3 obj = new PK3();
		
		obj.Ankush(10);
		PK3.Kale(2010);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
