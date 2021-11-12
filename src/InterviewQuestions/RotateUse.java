package InterviewQuestions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
/***************************Always accept number in Integer and convert in to string**********************************************/		
		Integer a[]= {10,20,30,40,50};
		System.out.println("Original Number : "+Arrays.toString(a));
		List al=Arrays.asList(a);
		if(num==1)
		{
			Collections.rotate(al, -1);
			System.out.println("Number after rotation : "+al);
		}else if(num==2)
		{
		Collections.rotate(al, -2);
		System.out.println("Number after rotation : "+al);
		}
/******************Second method*****************************************/
		List l=new ArrayList();
		for(int i=10;i<60;i+=10)
		{
			l.add(i);
		}
		if(num==1)
		{
			Collections.rotate(l, -1);
			System.out.println();
			System.out.println(l);
		}else if(num==2)
		{
			Collections.rotate(l, -1);
			System.out.println();
			System.out.println(l);
		}

		
		

	}

}
