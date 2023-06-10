package Abstract;

public class FINAL_variable {
	
	final int a = 10; // now we cant change the value of a in entire class
	
	
	
	public void Pune()
	{
		
		System.out.println(a);
	}
	
	public static void main (String[] args)
	{
		FINAL_variable obj = new FINAL_variable();
		obj.Pune();
	}
	
	
	

}
