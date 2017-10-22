import java.io.File;
import java.io.IOException;


public class Filex1 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl = new File("E:\\Anil\\Java\\Testfolder");
		File f2 = new File("E:\\Anil\\Java\\Testfolder\\test1.txt");
		System.out.println(fl.exists());
		
		if (fl.exists())
			System.out.println("Path Exist");
		else
			fl.mkdir();
		
		f2.createNewFile();
	}
}
