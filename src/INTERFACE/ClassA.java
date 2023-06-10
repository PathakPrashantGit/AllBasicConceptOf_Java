package INTERFACE;

public class ClassA implements interface1{
	
	public void Remo()
	{
		System.out.println("call the Interface");
	}
	public void Remo(int a)
	{
		System.out.println("I have the Arguments");
	}
	public void Path()
	{
		System.out.println("Living in bangalore");
	}
	
	public static void main (String[] args)
	{
		ClassA obj = new ClassA();
		obj.Remo(4);
		obj.Path();
		//Basic.Punit();               // cannot call the Static method of interface in class bcz it is FINAL
		//System.out.println(Basic.a); // cannot call the variable a also in class from INTERFACE bcz it is FINAl
	}
	
	
	
	
	
}
