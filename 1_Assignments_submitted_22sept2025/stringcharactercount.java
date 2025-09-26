package guvi1;

import java.util.Scanner;

public class stringcharactercount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 = sc.nextLine();
		int count = 0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(!(vowel(ch))) {
				count++;
			}
		}
		System.out.print(count);
	}
	
	public static boolean vowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
		ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') { return true; }
		return false;
	}

}
