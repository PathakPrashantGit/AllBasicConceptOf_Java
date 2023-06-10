  package NONPRIMITIVE;

public class STring1
{
	public static void main (String [] args)
	{             //012345678
		String g = "Bangaluru city ";
		
		//  to call the any character in Bangaluru
		char c = g.charAt(8);
		System.out.println(c);
		
		// to find the length of Bangaluru
		System.out.println(g.length());
		
		//to check the character in sequence present in String by true and false
		System.out.println(g.contains("luru"));
		
		//for create substirng give begin index
		System.out.println(g.substring(6));
		
		System.out.println(g.substring(0,6));
		
		// add new string (City) in existing String(Bangluru)
		System.out.println(g.concat(" City"));
		
		//to change the later in upper cases
		System.out.println(g.toUpperCase());
		
		//tochange leter in lower cases
		System.out.println(g.toLowerCase());
		
		//Reverse the string
		int len = g.length(); // len = 9
		 for(int a=len-1; a>=0; a--)
		 {
			 System.out.print(g.charAt(a));
		 }
		 System.out.println();
		 
		 // to find the number of spaces
		 int len1 = g.length();
		 int count = 0;
		 
		 for (int a =0; a<len1; a++)
		 {
			 if(g.charAt(a)==' ')
			 {
				 count++;
			 }
		 }
		 System.out.println(count);
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
