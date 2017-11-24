
public class FinalArray {

	final int[] arr1 = new int[]{1,2,3,4,5};
	 int i=10;
	
	public void changeArray(final int j)
	{
		//int[] arr2 = new int[]{5,2,3,4,5};
		System.out.println(arr1[2]+"-"+j);
				arr1[2]=9;
		//arr1=arr2;
		//j=20;
		System.out.println(arr1[2]+"-"+j);
		
	}
	
	public static void main(String[] args) {
	
		FinalArray f1=new FinalArray();
		f1.changeArray(20);
		
	}

}
