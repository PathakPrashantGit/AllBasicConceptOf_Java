package Abstract;

public abstract class Basic {  // incomplete abstract method
	
	public void complete() // complete method
	{
		System.out.println("Good Mornig everyone and wakeup");
	}
	
	public abstract void Thursday(); // incomplete method
	
	
	public abstract void incomplete(); // incomplete abstract method
	
	
	public static void Nagpur()
	{   //static method can be run in abstract class
		
		System.out.println("this can be Run");
	}
	
	
	public static void main (String[] args)
	{
		//Basic obj = new Basic(); // can not create the object of abstract method in main method
		Basic.Nagpur();
	}
	
	
	
	

}
