package CASTING;

public class UPCASTING_IMPLEMENT implements UPCASTING_INTERFACE {
	
	public void test()
	{
		System.out.println("Complete method of interface");
	}
	
	public void HII()
	{
		System.out.println("completed HIII");
	}
	
	public static void main (String[] args)
	{
		UPCASTING_INTERFACE obj = new UPCASTING_IMPLEMENT();
		obj.test();
		obj.HII();
		
		System.out.println(obj.a);
	}

}
