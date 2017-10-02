
public class DaimondExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int i,j,index,layers,hLayers;
layers=4;
hLayers=layers/2+1;
index=0;
for(i=0;i<layers;i++)
{
	for(j=0;j<=i;j++)
	{
		//if()
			System.out.print(" ");
			System.out.println("*");
	
	if (j<=hLayers)
		index++;
	else
		index--;
	}
}
}	
}

	
	
	


