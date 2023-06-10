package RETURN_TYPE;

public class Basic {
	
	
	public int sample()
	{
		int a = 12;
		int b = 15;
		
		int c =a+b; // 27
		
		
		return c;
		
	}
	
	public int test(int d, int f)
	{
		int g = d+f;
		System.out.println(g);
		return g;
	}
	
    public static void main(String[] args)
    {
	    Basic obj = new Basic();
	    int v = obj.sample(); // stored the return value in the int v (datatype must be same as datatype mentioned with the Method declaration in return type)
	   int z = v+10;
	  System.out.println(z);
	  
	  int y = obj.test(40, 40);
	  int k =y+80;
	  System.out.println(k);
    }

}
