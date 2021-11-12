package String;

public class SwapFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to tyss company";
		String[] n=s.split(" ");
		String temp=n[0];
		n[0]=n[n.length-1];
		n[n.length-1]=temp;
		for(String ch:n)
		{
			System.out.print(ch+" ");
		}
		

	}

}
