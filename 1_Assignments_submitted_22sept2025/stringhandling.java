package string;

import java.util.Scanner;

public class stringhandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = "I am learning java";
		String str = new String("Hello");
		String user = new String(sc.nextLine());
		System.out.println(s+" "+str+" "+user);
		int l = str.length();
		System.out.println(l);
		char ch1 = s.charAt(0);
		System.out.println("position 0 : "+ch1);
		String s4 = "hello how are you ? I am working in HCL",s1="HCL",s2="HCL1";
		System.out.println(s2.contains(s1));
		System.out.println(s1.equals(s1));
		s1 = s4.substring(12,16);
		System.out.println(s1);
	}

}
