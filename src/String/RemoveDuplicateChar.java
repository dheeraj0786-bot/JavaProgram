package String;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String or="abcbdefhgdsbdjvvbnb";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<or.length();i++)
		{
			set.add(or.charAt(i));
		}
		for(char ch:set)
		{
			System.out.print(ch);
		}
		
			
				
		}
		
		

	

}
