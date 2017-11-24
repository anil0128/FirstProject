import java.io.File;
import java.io.IOException;


public class fileExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl= new File("E:\\Anil\\Java\\Java Practice\\testcreate");
			if (fl.exists())
			{
				System.out.println("exist");
			}
			else
			{
				//System.out.println("Not exist");
				fl.mkdirs();
				//fl.createNewFile();
			}
			
			int dirCnt=0,fileCnt=0;
			
			File[] fileArr1 = fl.listFiles();
			System.out.println("Total No. of file/directory : "+fileArr1.length);
			for(File f1:fileArr1)
			{
				if(f1.isDirectory())
					dirCnt++;
				else
					fileCnt++;
				//System.out.println(f1.getName());
			}
			System.out.println("No. of Directories :"+dirCnt);
			System.out.println("No. of Files :"+fileCnt);
			
			
			File f2=fl.getAbsoluteFile();
			System.out.println(f2.getName());
	}

}
