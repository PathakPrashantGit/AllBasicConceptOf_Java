package NONPRIMITIVE;

public class Space_String {
	
	
	public static void main (String[] args)
	{
		String a = "Gr eat A sh oka";
		int d = a.length();
	
		int count =0;
		for (int b = 0; b<d; b++)
		{
		
			 if(a.charAt(b)== ' ')
			 {
				 count++;
			 }
				
			
		}
		 System.out.println(count);
		
		
		
		
		
		
	}
	
	
	

}
