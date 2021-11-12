package Self;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacterUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Ta daa Ta daa";
		Map<Character,Integer>map=new HashMap();
		char[] ac=name.toCharArray();
		for( char rp:ac)
		{
			if(map.containsKey(rp))
			{
				map.put(rp, map.get(rp)+1);
			}else
			{
				map.put(rp, 1);
			}
		}
		System.out.println(name+" :) "+map);

	}

}
