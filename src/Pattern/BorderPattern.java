package Pattern;

public class BorderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*******************outer loop is for rows********************************************/
		for(int row=1;row<=4;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=1;col<=4;col++)
			{
				if(row==1 || row==4 || col==1 ||col==4)
				{
					System.out.print("* ");
				}
/*****************************else condition is given because if condition fails still cursor should move otherwise it will print on same position(2,1)**/
				else {
					System.out.print("  ");
				}
				
			}//end of inner loop
			System.out.println();
		}

	}

}
