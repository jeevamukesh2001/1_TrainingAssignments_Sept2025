package loopingstatements;

import java.util.Scanner;

public class divisibility3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter start : ");
		int start = sc.nextInt();
		System.out.print("Enter end : ");
		int end = sc.nextInt();
		for(int i=end;i>=start;i--) {
			if(i%3==0&&i%5==0) System.out.print(i+" ");
		}
	}

}
