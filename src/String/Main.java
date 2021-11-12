package String;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String str="aaaaahjuguuiiinbnn";
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;

		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == 'a' || str.charAt(i) == 'A') {
				a++;
			}
			if (str.charAt(j) == 'e' || str.charAt(i) == 'E') {
				e++;
			}
			if (str.charAt(j) == 'i' || str.charAt(i) == 'I') {
				i++;
			}
			if (str.charAt(j) == 'o' || str.charAt(i) == 'O') {
				o++;
			}
			if (str.charAt(j) == 'u' || str.charAt(i) == 'U') {
				u++;
			}
		}

		System.out.println("Number of 'a' = " + a);
		System.out.println("Number of 'e' = " + e);
		System.out.println("Number of 'i' = " + i);
		System.out.println("Number of 'o' = " + o);
		System.out.println("Number of 'u' = " + u);
	}


}

