
public class TestJava1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(10+20);
//System.out.println(10+""+20);
//System.out.println(10+20+""+20+30);

//String str1="My Order number is 123456";
//String[] arr1=str1.split(" ");
//System.out.println(arr1[arr1.length-1]);


//String str2 ="java";
String str2 =new String("java");


//String ObjStr="java";
String ObjStr=new String("java");

if  (str2==ObjStr)
	System.out.println("== pass");
else
	System.out.println("== fail");


if  (str2.equals(ObjStr))
	System.out.println("equals pass");
else
	System.out.println("equals fail");


	}

}
