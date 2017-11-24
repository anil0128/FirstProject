import java.util.Date;


public class DateExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date dt1 = new Date();
		System.out.println(dt1);
		System.out.println(dt1.getDate());
		System.out.println(dt1.getMonth()); //it will print 1 less month as month starts with 0 i.e January is 0 ;
		System.out.println(dt1.getYear()); //it starts with 1900..as windows calendar is not beyond that
		System.out.println(dt1.getTime());
		
		Date bdate = new Date();
		bdate.setDate(28);
		bdate.setMonth(2);
		bdate.setYear(86);
		System.out.println(bdate);
		
		long SysTime,bTime,result;
		
		SysTime=dt1.getTime();
		bTime=bdate.getTime();
		result=SysTime-bTime;
		
		long days = ((((result/1000)/60)/60)/24)/365;
		System.out.println(days);
		
		
		
		
	}

}
