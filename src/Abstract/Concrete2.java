package Abstract;

public class Concrete2 extends Basic{
	
	public  void incomplete() 
	{
		System.out.println("Now I extended in the another class");
		
	}
    public static void main (String[] args)
    {
    	Concrete2 obj = new Concrete2();
    	
    	obj.incomplete();
    	
    }
	@Override
	public void Thursday() {
		// TODO Auto-generated method stub
		
	}
}
