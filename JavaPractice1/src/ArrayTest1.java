
public class ArrayTest1 {

	int[] a1 = new int[]{10,20,30,40,50};
	
	int[] a2 = new int[]{40,60,50,20,30};
	//int[] a2 = new int[]{11,21,31,41,51};
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest1 arr1 = new ArrayTest1();
		System.out.println("Array with for loop");
		for(int i=0;i<arr1.a1.length;i++)
		{
			System.out.println("Value is "+ arr1.a1[i]);
		}
		System.out.println("Array with foreach loop");
		for(int j:arr1.a1)
		{
			System.out.println("Value is "+ j);
		}
		
		int max=arr1.a2[0];
		int min=arr1.a2[0];
		
		for(int k=1;k<arr1.a2.length;k++)
		{
			if(arr1.a2[k]>max)
				max=arr1.a2[k];	
			else if (arr1.a2[k]<min)
				min=arr1.a2[k];	
		}
		System.out.println("Value max and Min "+ max+min);
	}

}
