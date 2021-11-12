package Pattern;

public class MindTreePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*******************outer loop is for rows********************************************/
		int count=1;
		for(int row=1;row<=5;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=1;col<=5;col++)
			{
				System.out.print(count++ +" ");
			}//end of inner loop
			if(row<=2) {
				count=count+5;
			}else if(row==3)
			{
				count=count-10;
			} 
			else
			{
				count=count-15;
			}
			
			System.out.println();
		}

	}

}
