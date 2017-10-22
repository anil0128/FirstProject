
public class ArrayCallByRef {

	public static void changeMe(int[] b)
	{
		b[2]=90;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {10,20,30,40,50};
		System.out.println("Value Before change ");
		for(int a:a1)
			System.out.println(a);
		
		changeMe(a1);
		
		System.out.println("Value After change ");
		for(int a:a1)
			System.out.println(a);
	}

}
