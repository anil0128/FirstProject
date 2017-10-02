
public class StaticMethod {

	static int i=10;
	
	{
		System.out.println("non Static Block "+i);
	}
	
	static
	{
		System.out.println("Static Block "+i);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Block ");
		StaticMethod s1=new StaticMethod();
		
	}
	
}


//////


