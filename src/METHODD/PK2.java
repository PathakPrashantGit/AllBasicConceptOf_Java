package METHODD;

public class PK2 
{
	char d = '%'; // non static global variable
	
	static String h ="how is thw josh"; // static global variable
	
	public void Rahul() // non static method ( we need to create the object in main method)
	
	{
		int j = 12; // local variable (we cannoot call local variable in main method or out side the method)
		String  y = "High sir"; // local variable
		 char j1 = 'g'; // local variable
		
		System.out.println(h);
		 
		System.out.println(j);
		System.out.println(y);
		System.out.println(j1);
		System.out.println("my name is prashant pathak");
	}
	
	public static void Akky() // Static method (dont need to create the object in main method)
	{
		int a = 23;
		String k = "call the police";
		System.out.println(h);
		System.out.println(k);
		System.out.println(a);
		System.out.println("my highest qualification is BE");
	}
	public static void main (String [] args)
	{
		PK2 obj = new PK2();
		obj.Rahul();
		PK2.Akky();
		System.out.println(obj.d);
		System.out.println(PK2.h);
		
		System.out.println();
		
		
	}
	
	
	
	
	
	
	

}
