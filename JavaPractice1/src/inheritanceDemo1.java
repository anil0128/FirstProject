class Parent
{
	public void Method1()
	{
		System.out.println("In Parent method1");
	}
	
	public void Method2()
	{
		System.out.println("In Parent method2");
	}
	public static void Method4()
	{
		System.out.println("In Parent static method4");
	}
}

class Child extends Parent
{
	public void Method1()
	{
		System.out.println("In Child method1");
	}
	
	public void Method3()
	{
		System.out.println("In Child method3");
	}
}

public class inheritanceDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1.Method1();
		c1.Method2();
		c1.Method3();
		Parent.Method4();
	}

}
