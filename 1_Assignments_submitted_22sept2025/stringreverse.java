package guvi1;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = "", s= "";
		for(int i=s1.length();i>0;i--) {
			s = s1.substring(i-1,i);
			s2 = s2.concat(s);
		}
		System.out.print(s2);
	}

}
