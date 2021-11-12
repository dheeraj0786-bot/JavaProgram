package Pattern;

public class AssignmentPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*******************outer loop is for rows********************************************/
		int trow=5;
		for(int row=1;row<=trow;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=1;col<=trow;col++)
			{
				if(row==1 || row==trow || col==trow ||col==1||row==col||col+row==trow+1)
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
