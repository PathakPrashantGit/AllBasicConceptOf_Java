package CONSTRUCTOR;

public class thisdeemo {
int a=2;
	public static void main(String[] args) {
		thisdeemo td=new thisdeemo();
		td.getdatathis();
	}
	public void getdatathis(){
		int a=3;
		int b=a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		
	}

}
