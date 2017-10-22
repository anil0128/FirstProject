
public class CallByValue {

	/**
	 * @param args
	 */
	public static void changeMe(int i,int j)
	{
		i=30;
		j=40;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=20;
		changeMe(i,j);
		System.out.println("Values :"+i+","+j);
	}

}
