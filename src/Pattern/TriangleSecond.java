package Pattern;

public class TriangleSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
/*******************outer loop is for rows********************************************/
		for(int row=1;row<=n;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=1;col+row<=n+1;col++)
			{
				
				System.out.print("* ");
				
			}//end of inner loop
			System.out.println();
		}
 
	}

}
