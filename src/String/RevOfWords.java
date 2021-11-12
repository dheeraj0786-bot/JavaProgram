package String;

public class RevOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to tyss";
		String[] n=s.split(" ");
		for(int i=n.length-1;i>=0;i--)
		{
			System.out.print(n[i]+" ");
		}

	}

}
