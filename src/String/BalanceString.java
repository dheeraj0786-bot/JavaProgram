package String;

import java.util.ArrayList;

public class BalanceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bal="{{[()]}}";
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<bal.length();i++)
		{
			if(list.size()!=0 && ((bal.charAt(i)==')' && list.get(list.size()-1)=='(')  ||(bal.charAt(i)==']' 
					&& list.get(list.size()-1)=='[')||(bal.charAt(i)=='}'&&list.get(list.size()-1)=='{')))
			{
				list.remove(list.size()-1);
			}else
			{
				list.add(bal.charAt(i));
				
			}
				
		}
		if(list.size()==0)
		{
			System.out.println("String is balanced");
		}else
		{
			System.out.println("String is not balanced");
		}
		

	}

}
