package Pattern;

public class SquarePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*******************outer loop is for rows********************************************/
		for(int row=0;row<3;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=0;col<4;col++)
			{
				System.out.print("* ");
			}//end of inner loop
			System.out.println();
		}

	}

}
