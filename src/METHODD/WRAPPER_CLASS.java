package METHODD;

public class WRAPPER_CLASS {
	
	// wrapper class = conversion of the data type
	
	public static void main(String[] args)
	{
		String x = "100";
		System.out.println(x+20);
		//convert the String into the int
		int i =Integer.parseInt(x); //Wrapper class
		System.out.println(i+20);
		
		//convert the String into Double
		String h = "12.33";
		double d = Double.parseDouble(h);
		System.out.println(d+100);
		
		//convert the String into boolean
		String j = "false";
		boolean f = Boolean.parseBoolean(j);
		System.out.println(j);
		
		//int to String conversion
		int g = 200;
		String l = String.valueOf(g);
		System.out.println(l+30);
		
		
		
		
		
		
	}

}
