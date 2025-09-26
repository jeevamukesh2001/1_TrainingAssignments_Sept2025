package loopingstatements;

import java.util.Scanner;

public class divisibility2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter start : ");
		int start = sc.nextInt();
		System.out.print("Enter end : ");
		int end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%3==0 && i%2==0) System.out.print(i+" ");
		}
	}

}
