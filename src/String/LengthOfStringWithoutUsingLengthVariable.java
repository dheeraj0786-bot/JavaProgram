package String;

public class LengthOfStringWithoutUsingLengthVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dheeraj";
		int count=0;
		char[] ch=s.toCharArray();
		String sg="";
		for(char ch1:ch)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			sg=sg+s.charAt(i);
		}
		System.out.println(sg);
		

	}

}
