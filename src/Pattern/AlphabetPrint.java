package Pattern;

public class AlphabetPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*******************outer loop is for rows********************************************/
		char count='A';
		for(int row=1;row<=4;row++)
		{
/*********************inner loop is for columns********************************************/
			for(int col=1;col<=4;col++)
			{
				System.out.print(count++ +" ");
			}//end of inner loop
			System.out.println();
		}

	}

}
