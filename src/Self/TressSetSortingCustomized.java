package Self;

import java.util.Comparator;
import java.util.TreeSet;

public class TressSetSortingCustomized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set=new TreeSet(new MyComparator3());
		set.add("Dheeraj");
		set.add("Sanjay");
		set.add("op");
		set.add("japish");
		set.add("neelabh");
		System.out.println(set);

	}

}
class MyComparator3 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String ob=obj1.toString();
		String ob2=obj2.toString();
		return ob2.compareTo(ob);
		
	}
}
