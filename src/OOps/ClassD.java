package OOps;

public class ClassD {
	
	int a = 20; // nonstatic global variable
	static String h = " rock"; // static global varible
	
	
	public void demo() // non static method
	{
		int b = 12; // local varible
		System.out.println(b);
		System.out.println("hello");
	}
	
	public static void test()
	{
		System.out.println(" hello world");
	}
	
public static void main (String [] args)
{
	int g = 23;
	System.out.println(g);
	ClassD obj = new ClassD();
	obj.demo();
	ClassD.test();
	System.out.println(obj.a);
	
	System.out.println(ClassD.h);
}
}
