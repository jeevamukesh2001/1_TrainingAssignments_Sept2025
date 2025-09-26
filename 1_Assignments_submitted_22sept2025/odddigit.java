package guvi1;

import java.util.Scanner;

public class odddigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int ld;
		for(int i=1;i<=5;i++) {
			ld=num%10;
			if(ld%2!=0) System.out.print(ld+" ");
			num/=10;
		}
	}

}
