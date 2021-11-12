package String;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="Hello i am Dheeraj i like to sleep";
		String[] word=words.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<word.length;i++)
		{
			set.add(word[i]);
		}
		for(String wor:set)
		{
			System.out.print(wor+" ");
		}
		
		
		

	}

}
