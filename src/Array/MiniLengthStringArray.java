package Array;

public class MiniLengthStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []ch= {"abc","xyz","ab","n","m"};
		String min=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(min.length()>ch[i].length())
			{
				min=ch[i];
			}
		}
		//here we use length with ch and length() with ch[i] because ch[i=0] will give string "abc"
		for(int i=0;i<ch.length;i++)
		{
			if(min.length()==ch[i].length())
			{
				System.out.print(ch[i]+" ");
			}
		}

	}

}
