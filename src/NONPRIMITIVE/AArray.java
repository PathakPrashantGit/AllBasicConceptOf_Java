package NONPRIMITIVE;

public class AArray {
	public static void main (String [] args)
	{
	
	
	
	int [] b = {10,20,36,87,78}; 
	           //o 1   2  3
	String s[] = {"velocity", "Kataraj", "pune", "Maharashtra"};
	
	System.out.println(b[3]);
	System.out.println(s[2]);
	System.out.println(s.length); // to find the lenght of array
	System.out.println(b.length);
	
	// to get the char of velocity
	String value = s[0];
	char d = value.charAt(5);
	System.out.print(d);
	
	System.out.println();
	
	// to print the reverse of the pune
	String aim = s[2];
	int len = aim.length();
	

	for(int a= len-1; a>=0; a--)
	{
		System.out.print(aim.charAt(a));
	}
	
	}
}
