import java.io.File;


public class randonFolder {
	
	public static void main(String[] args) {
		
		String str1="abcdefgi";
		System.out.println(str1.length());
		
		for(int j=0;j<5;j++)
		{
			int index=(int)(0+str1.length()*Math.random());
			System.out.println(index+"-"+str1.charAt(index));
			File fl= new File("E:\\Anil\\Java\\Java Practice\\testcreate\\"+str1.charAt(index));
			if (fl.exists())
			{
				System.out.println("exist");
			}
			else
			{
				//System.out.println("Not exist");
				fl.mkdir();
				//fl.createNewFile();
			}
		}
	}
}
