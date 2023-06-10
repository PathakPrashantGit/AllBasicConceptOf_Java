package RETURN_TYPE;



public class STRING {
	
	
	public char demo()
	{
		String h = "olleH";
		char c=' ';
		for(int i = h.length()-1; i>=0; i--) {
			 c = h.charAt(i);
			
		}
		return c;
	
		
	
		
	
	}
	public static void main(String[] args)
	{
		STRING obj = new STRING();
		char k =obj.demo();
		
		System.out.println(k);
	}

}
