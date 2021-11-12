package Pattern;

public class AlphaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				char count='A';
				int n=5;
				// TODO Auto-generated method stub
		/*******************outer loop is for rows********************************************/
				for(int row=1;row<=n;row++)
				{
		/*********************inner loop is for columns********************************************/
					for(int col=1;col<=row;col++)
					{
						if(row>=col)  
						
						System.out.print(count++ +" ");
					
						
					}//end of inner loop
					System.out.println();
				}
		 
			}

		

	}


