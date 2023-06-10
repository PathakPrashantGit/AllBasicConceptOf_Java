package OOps;

public class Method_ovrride2 extends Method_ovrride1 {   // this is subclass (Method_ovrride2) which is inheriting the superclass (Method_ovrride1 )
	
	public static void rahul()  // Static method can not  overriding
	{
		System.out.println("Its me RAAZ");
	}
	
	public void DON()
	{
		super.rahul(); // to call the superclass in subclass
		this.rahul();  // to call the subclass
		//super.path(); not possible because method is private
	}
//	private void path()
//	{
//		System.out.println("Private overrided");
//	}
//	
	
	public static void main (String [] arhs)
	{
		Method_ovrride2 obj = new Method_ovrride2();
		//obj.path();
		obj.DON();
		
	}

}
