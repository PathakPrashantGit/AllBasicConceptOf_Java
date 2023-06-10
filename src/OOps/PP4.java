package OOps;

public class PP4  {
	
	
	public void pathak() {
		System.out.println(" method");
	}
	public void pathak(int a) // parameter
	{
		System.out.println("method overloading");
	}
	public void pathak(String b)
	{
		System.out.println("lets create the method");
	}
	
	
	
	public static void main (String[] args)
	{
		PP4 obj = new PP4();
		
		obj.pathak(4585); // Argument
	}

}
