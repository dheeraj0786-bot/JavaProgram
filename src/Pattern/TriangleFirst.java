package Pattern;

public class TriangleFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*******************outer loop is for rows********************************************/
		for(int row=1;row<=4;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=1;col<=row;col++)
			{
				/*if(row>=col)  or directly we can write row>=col condition in col for loop*/
				//{
				System.out.print("* ");
				//}
				
			}//end of inner loop
			System.out.println();
		}
 
	}

}
