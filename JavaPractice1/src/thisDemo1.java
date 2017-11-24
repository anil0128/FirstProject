
public class thisDemo1 {
	int i;
	thisDemo1()
	{
		this(10);
		this.i=40;
		System.out.println("This Demo first constructor with value of i="+i);
	}
	
	thisDemo1(int k)
	{
		System.out.println("This Demo second constructor for value K="+k);
	}
	
	public void hello()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		thisDemo1 d1 = new thisDemo1();
		d1.hello();

	}

}
