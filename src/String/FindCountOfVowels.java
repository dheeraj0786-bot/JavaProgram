package String;

import java.util.LinkedHashMap;

public class FindCountOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      String str = "AEAIOG";
		      LinkedHashMap<Character, Integer> hMap = new LinkedHashMap();
		      hMap.put('A', 0);
		      hMap.put('E', 0);
		      hMap.put('I', 0);
		      hMap.put('O', 0);
		      hMap.put('U', 0);
		      for (int i = 0; i < str.length(); i++) {
		         if (hMap.containsKey(str.charAt(i))) {
		            int count = hMap.get(str.charAt(i));
		            hMap.put(str.charAt(i), ++count);
		         }      
		      }
		      System.out.println(hMap);
		   }
		
		

	}


