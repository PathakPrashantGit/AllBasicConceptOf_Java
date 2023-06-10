package NONPRIMITIVE;

public class Avg_Array {

	public static void main (String [] args)
	{ 
		int total = 0;
		int a[] = {10,20,30,40};
		
		for(int i = 0; i<a.length; i++)
		{
			total+=a[i];
			
		}
		System.out.println(total/a.length);
	}
}
