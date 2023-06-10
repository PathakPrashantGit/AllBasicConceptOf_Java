package CONSTRUCTOR;

public class CLASS3 {
	
	String name;
	int age ;
	static int s = 13;
	
	public CLASS3(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public CLASS3(int i) 
	{
		System.out.println(i);
	}
	
    public static void main(String[] args) 
    {   
    	CLASS3 obj1 = new CLASS3(10);
    	CLASS3 obj = new CLASS3("prashant",26);
    	CLASS3 obj2 = new CLASS3("Rahul",62);
    	System.out.println(obj.name);
    	System.out.println(obj.age);
    	System.out.println(obj2.name+ " " +obj2.age);
    
	}
    
	

}
