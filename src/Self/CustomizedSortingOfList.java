package Self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomizedSortingOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(5);
		al.add(6);
		al.add(12);
		al.add(15);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, new MyComparator());
		System.out.println(al);
	
		

	}

}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		if(I1<I2)
		{
			//return -1;
			return +1;

		}else if(I1>I2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
}