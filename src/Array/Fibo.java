package Array;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number till you get fibo");
		int num=sc.nextInt();
		int first=0;
		int second=0;
		int next=1;
		for(int i=0;i<=num;i++)
		{
			first=second;
			second=next;
			next=second+first;
			System.out.print(first+" ");
			
		}
				

	}

}
