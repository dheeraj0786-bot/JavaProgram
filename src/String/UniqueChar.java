package String;

import java.util.HashSet;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String or="abcbdefhgdsbdjvvbnb";
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<or.length();i++)
		{
			set.add(or.charAt(i));
		}
		for(char ch:set)
		{
			int count=0;
			for(int i=0;i<or.length();i++)
			{
				if(ch==or.charAt(i))
				{
					count++;
				}
			}
			//System.out.println(ch+"="+count);
			if(count==1)
			{
				System.out.println(ch+" = "+count);
			}
				
		}
		
		

	}

}
