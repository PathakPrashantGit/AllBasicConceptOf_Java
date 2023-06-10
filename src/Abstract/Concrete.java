package Abstract;

public class Concrete extends Basic {
	
	
	public  void Thursday()
	{
		System.out.println("I am going to complete that method");
	}
	public  void incomplete()
	{
		System.out.println("I have done the complition");
	}
	
	
	public static void main (String[] args)
	{
		Concrete obj = new Concrete();
		obj.Thursday();
		obj.incomplete();
		obj.complete();
		Basic.Nagpur();
	}


	
	
	

}
