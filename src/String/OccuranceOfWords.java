package String;

import java.util.HashSet;

public class OccuranceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="Hello i am Dheeraj i like to sleep";
		String[] word=words.split(" ");
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<word.length;i++)
		{
			set.add(word[i]);
		}
		for(String st:set)
		{
			int count=0;
			for(int j=0;j<word.length;j++)
			{
				if(st.equalsIgnoreCase(word[j]))
				{
					count++;
				}
			}
			System.out.println(st+" = "+count);
		}
		

	}

}
