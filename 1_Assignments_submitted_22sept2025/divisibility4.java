package guvi1;

import java.util.Scanner;

public class divisibility4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter start : ");
		int start = sc.nextInt();
		System.out.print("Enter end : ");
		int end = sc.nextInt();
		int count = 0;
		for(int i=start;i<=end;i++) {
			if(i%7==0) {
				System.out.print(i+" ");
				count++;
				if(count==10) break;
			}
		}
	}

}
