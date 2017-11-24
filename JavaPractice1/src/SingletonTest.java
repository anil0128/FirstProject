
public class SingletonTest {

	private static SingletonTest clObject = new SingletonTest();
	private SingletonTest(){
		
	}
	
	public void hello(){
		System.out.println("hello");
	}
	
	public static SingletonTest getSingletonTestObject(){
		return clObject; 
	}
	
}
class A1{
	public static void main(String[] args) {
		SingletonTest kl = SingletonTest.getSingletonTestObject();
		kl.hello();
	}
}