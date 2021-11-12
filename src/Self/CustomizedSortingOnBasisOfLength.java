package Self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomizedSortingOnBasisOfLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Hello");
		al.add("Hi");
		al.add("India");
		al.add("Japan");
		al.add("Usa");
		al.add("China");
/**************************Insertion order preserved********************************************************************/
		System.out.println(al);
/*************************default natural sorting order*****************************************************************/
		Collections.sort(al);
		System.out.println(al);
/***************************Customized sorting order********************************************************************/
		Collections.sort(al, new MyComparator2());
		System.out.println(al);


	}

}
class MyComparator2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String ob1=(String)obj1;
		String ob2=(String)obj2;
		if(ob1.length()<ob2.length())
		{
			return -1;
		}
		else if(ob1.length()>ob2.length())
		{
			return +1;
		}else
		{
			return ob1.compareTo(ob2);
		}
		
	}
}
