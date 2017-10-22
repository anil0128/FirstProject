
public class CallByRef {

	public static void changeMe(A obj)
	{
		obj.i=30;
		obj.j=40;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		a1.i=10;
		a1.j=20;
		changeMe(a1);
		System.out.println("Values :"+a1.i+","+a1.j);
	}

}
