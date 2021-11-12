package Array;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int num=sc.nextInt();
		int or=num;
		int rev=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==or)
		{
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}

}
