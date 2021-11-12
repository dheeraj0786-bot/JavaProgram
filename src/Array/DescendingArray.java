package Array;

public class DescendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,3,20,12,6,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a[0]);
	

	}

}
