class B 
{
	B()
	{
		System.out.println("Class B constructor");
	}
	
	public void Method1()
	{
		System.out.println("Class B Method");
	}
}

 class C extends B
{
	C()
	{
		System.out.println("Class C constructor");
	}
	 public void Method1()
	{
		System.out.println("Class C Method");
	}
}

 class D extends C
{
		D()
		{
			System.out.println("Class D constructor");
		}
		
	public void Method1()
	{
		System.out.println("Class D Method");
	}
}

public class inheritanceDemo2 {

	public static void main(String[] args) {
		D d1=new D();
		B b1 = new D();

		
	}
}
