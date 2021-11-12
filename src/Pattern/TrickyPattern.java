package Pattern;

public class TrickyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*******************outer loop is for rows********************************************/
		int n=7;
		for(int row=1;row<=n;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=1;col<=n;col++)
			{
				if(row==1 || row==(n/2)+1 || col==(n/2)+1 ||col==1||row==n||col==n)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			
			}//end of inner loop
			System.out.println();
		}

	}

}
