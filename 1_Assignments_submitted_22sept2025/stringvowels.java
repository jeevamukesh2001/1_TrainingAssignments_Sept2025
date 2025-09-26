package guvi1;

import java.util.Scanner;

public class stringvowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 = sc.nextLine();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.print(ch+" ");
			}
		}
	}

}
