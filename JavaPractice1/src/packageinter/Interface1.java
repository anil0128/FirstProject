package packageinter;

public interface Interface1 {

int i=10;
public void go();
public void method1();

public static void main(String[] args) {

}

}

interface Interface2 {

public void go();
public void method1();

}


class InterfaceDemo implements Interface1, Interface2
{
	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println(i);
		//i=20;						---- value updation is not allowed as all variables are Final in interfaces
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}