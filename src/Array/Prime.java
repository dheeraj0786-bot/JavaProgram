package Array;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to whether its prime or not");
		int num=sc.nextInt();
		int count=0;
		if(num==0||num==1)
		{
			System.out.println("number is not prime");
		}else {
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("number is prime");
		}else {
			System.out.println("Number is not prime");
		}
		

	}

}
