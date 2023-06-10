package CONSTRUCTOR;



public class CLASS_2 {
	
	int a= 20;  // non static Global variable
    static int b = 12; // static global variable


	public CLASS_2() // user defined cunstruction
	{
		System.out.println(" hi i am the constructer");
	}
	public CLASS_2 (int a) //parameterise cunstructor
	{
		System.out.println("use me");
	}
	public CLASS_2(String k)
	{
		System.out.println("lets find the solution");
	}
	
    public static void main (String[] args) //main method
    {
    	CLASS_2 obj = new CLASS_2("h");
    	System.out.println(obj.a);
        System.out.println(CLASS_2.b);
    }
	
	
	

}
