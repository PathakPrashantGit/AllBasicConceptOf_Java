package Abstract;

public class FINAL_Method {
	
	public final void Dream() // we cannot override this method in another class because its fix method
	{
		final int h = 10;
		
		System.out.println("Now this is fixed");
		
		System.out.println(h);
	}
	public final void Dream( int a)
	{   
		a= 45;
	System.out.println(a);
		System.out.println("that is static");
	}
	public static void main (String[] args)
	{
		 FINAL_Method obj = new FINAL_Method ();
		 obj.Dream(4);
		 
	}
	

}
