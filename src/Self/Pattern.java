package Self;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=0;i<=n;i++)
		{
			int count=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}
