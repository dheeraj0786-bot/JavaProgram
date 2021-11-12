package Array;

public class StringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Dheeraj";
		String s2="sampath";
		String final1="";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					final1=final1+s2.charAt(j);
				}
			}
		}
		System.out.println(final1);

	}

}
