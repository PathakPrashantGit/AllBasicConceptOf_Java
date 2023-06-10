package OOps;

public class Mthd_ovrldg_Nonstic { // method overloading
	
	
	public void gate() // Non static Zero Argument method
	{
		System.out.println("I am nonstatic method");
	}
	
	public void gate(int a) // Non static Int argument of same method name
	{
		System.out.println("I am int argument");
	}
	
    public static void gate(String g)
    {
    	System.out.println("I am static string argument");
    }
	
	
	public static void main (String[] args)
	{
		Mthd_ovrldg_Nonstic obj = new Mthd_ovrldg_Nonstic();
		obj.gate();
		obj.gate(4);
		Mthd_ovrldg_Nonstic.gate("h");
	}
	

}
