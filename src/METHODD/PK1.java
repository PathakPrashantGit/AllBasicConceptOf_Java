package METHODD;

public class PK1 {
	String H ="I am the robot"; // non static global variable 
    static int k = 12;	// static global variable

	public static void main (String[] args)
	{
		PK1 obj = new PK1(); // to call the non static variable we have to write the object 
		System.out.println(obj.H); 
		System.out.println(PK1.k); // to call the static variable we dont need to create the obj
	}                              //write class name and refrence variable
	
	
	
	
	
	
	
	
	
	

}
