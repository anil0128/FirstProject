
public class RandomExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intRd;
		double rd = 0;
		for(int i=0;i<10;i++)
		{
		 rd=Math.random()*100+100;
		 intRd=(int)rd;
		// System.out.println(intRd);
		}
		
		String str1="abcdefgi";
		System.out.println(str1.length());
		
		for(int j=0;j<5;j++)
		{
			int index=(int)(0+str1.length()*Math.random());
			System.out.println(index+"-"+str1.charAt(index));
		}
	}

}
