package String;

public class LengthOfStringUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dheeraj";
		String sg="";
		for(int i=s.length()-1;i>=0;i--)
		{
			sg=sg+s.charAt(i);
		}
		System.out.println(sg);
		

	}

}
