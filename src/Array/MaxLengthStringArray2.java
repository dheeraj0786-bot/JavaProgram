package Array;

public class MaxLengthStringArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []ch= {"abc","xyz","ab","n"};
		String max=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(max.length()<ch[i].length())
			{
				max=ch[i];
			}
		}
		//here we use length with ch and length() with ch[i] because ch[i=0] will give string "abc"
		for(int i=0;i<ch.length;i++)
		{
			if(max.length()==ch[i].length())
			{
				System.out.print(ch[i]+" ");
			}
		}

	}

}
