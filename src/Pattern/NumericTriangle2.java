package Pattern;

public class NumericTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int count=1;
/*******************outer loop is for rows********************************************/
		for(int row=1;row<=n;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=1;col<=n;col++)
			{
				if(row+col>=n+1)
				{
				System.out.print(count++ +" ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}//end of inner loop
			System.out.println();
		}
 
	}

}
