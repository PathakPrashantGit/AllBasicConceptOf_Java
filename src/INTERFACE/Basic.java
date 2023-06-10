package INTERFACE;

public interface Basic {
	
	int a = 12; // declared variable is By Default STATIC, PUBLIC, FINAL
	
	/*public void Monday() {           // cannot create complete method inside the interface
	System.out.println("Monday"); } */
	
	
	public void Remo(); // we can write only incomplete method inside the interface
	
	public void Remo(int a); // we can write method overload of same incomplete method name by changing its arguments

	public static void Punit() // can write static method inside the interface
	{
		//a = 45; // we cannot change the variable a value bcz its FINAL 
		System.out.println("Hello Punit");
	}
	
	public static void main (String[] args)
	{
		Basic obj = new Basic(); // we cannot create the object in the interface
		                         // Interface cannot create the By Default constructer also
		
		System.out.println(Basic.a); // a is static variable in INTERFACE thats why we can call it
		Basic.Punit(); //Punit is static method in INTERFACE thats why we can call it
		
	}
	
	
	
	
	
	
}
