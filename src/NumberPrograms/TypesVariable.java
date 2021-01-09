package NumberPrograms;

public class TypesVariable {
	
	 int d=10;
	
	 public  void A()
	{
		int a=10;
		a=20+d;
		int c=5+a;
		System.out.println("hai"+a);
		System.out.println("hai"+c);
	}
	
	public void b()
	{
		
		
		System.out.println("hellow"+d);
	}

	public static void main(String[] args) {
		
		TypesVariable t=new TypesVariable();
		
		System.out.println();
		t.b();
		t.A();
	
	}

}
