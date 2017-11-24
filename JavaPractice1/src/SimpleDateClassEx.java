import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateClassEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sDt1 = new SimpleDateFormat("MM-dd-yyyy");
		Date dt1 = new Date();
		System.out.println(sDt1.format(dt1));
		//System.out.println(sDt1);
	}

}
