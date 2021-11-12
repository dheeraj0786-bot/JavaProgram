package Array;

public class AdditionOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,30,1,50};
		int [] b= {9,8,7,5};
		int max=a.length;
		if(max<b.length)
		{
			max=b.length;
		}
		for(int i=0;i<max;i++)
		{
			try {
				System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
/////////////////////////*****Compare length*******/////////////////////				
				if(a.length<b.length)
				{
					System.out.println(b[i]+" ");
				}
				else {
					System.out.println(a[i]+" ");
				}
			}
		}
		

	}

}
