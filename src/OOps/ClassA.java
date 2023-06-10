package OOps;

 public class ClassA { // default
	
	    int a = 45; // default 
	 String h = "I am the ROBO";
	
	protected void boom ()
	{
		System.out.println("my name is GRoot");
	}

	public static void Ind()
	{
		System.out.println("I love my India");
	}
	public static void main(String[] aegs)
	{
		ClassA obj = new  ClassA();
		obj.boom();
		System.out.println(obj.a);
		System.out.println(obj.h);
	}

}
