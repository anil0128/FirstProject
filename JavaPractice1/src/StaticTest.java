
public class StaticTest {
	int i=10;
	static int j=20;
	
	public void printValue()
	{
		System.out.println("non static method:"+i+j);
		i=55;
		j=222;
	}
	public static void main(String[] args) {
		StaticTest t1= new StaticTest();
		System.out.println("Value of i : "+t1.i);
		t1.i=444;
		System.out.println("Change Value of i : "+t1.i);
		System.out.println("Value of i : "+StaticTest.j);
		j=8888;
		System.out.println("Value of i : "+StaticTest.j);
	}
	
}
		
		
		//ddd
		
		
	

