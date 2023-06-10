package CONSTRUCTOR;

public class CLASS_1 {
	String name;
	
	int emid ;

	
	public CLASS_1(String name, int emid)
	{
		this.name = name;
		this.emid=emid;
	}
	
	public static void main (String[] args)
	{
		CLASS_1 obj1 = new CLASS_1("prashant",102);
		CLASS_1 obj2 = new CLASS_1("Dhawal",308);
		System.out.println("Emploee1 :- "+obj1.name+ " " +obj1.emid);
		System.out.println("Emploee2 :- "+obj2.name+ " " +obj2.emid);
	}
	
	
}
