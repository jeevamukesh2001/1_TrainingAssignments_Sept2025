package guvi1;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		int rnum=0,ld;
		while(num>0) {
			ld=num%10;
			rnum=rnum*10+ld;
			num=num/10;
		}
		System.out.println(rnum);
	}

}
