package CASTING;

public class UPCASTING1_CHILD extends UPCASTING_PARANT {
	
	public void demo()
	{
		System.out.println("I am Child Property");
	}
	public void test()
	{
		System.out.println("Modified wednessday method");
	}
	
	public void DON()

	{
		super.test(); // we can print both method like parant and child
		this.test();
	}
	public static void main (String[] args)
	{
		UPCASTING_PARANT obj = new UPCASTING1_CHILD (); // upcasting
		obj.test();
		obj.hello();
		obj.DON(); // can not run any of method from Child by upcasting
		obj.demo(); //can not run any of method from Child by upcasting
		
		
		
		
		
		/* UPCASTING_CHILD obj = new UPCASTING_CHILD(); // by creating object of child class we can call all propertyof child class
		obj.demo();
		obj.test();
		obj.hello(); it is inherted by the parant class we can call by using child object
		
		UPCASTING_Parant obj = new UPCASTING_Parant(); // by creating the object of parant class I can call only parant class member
		 obj.test();
		obj.hello();
		 obj.demo(); // i Cannot call it by creating the object of parant class */
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
