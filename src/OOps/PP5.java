package OOps;

public class PP5 extends ClassA {
	
	public  void boom ()
	{
		System.out.println(" overriding");
	}
	
	
	public static void main (String[] args)
	{
		PP5 obj1 = new PP5();
		ClassA obj =new ClassA();
		obj.boom();
		obj1.boom();
		System.out.println(obj.a);
	}
	
	
	

}
