package guvi1;

import java.util.Scanner;

public class digitsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int y=n%10;
			sum=sum+y;
			n/=10;
		}
		System.out.print("Sum : "+sum);
	}

}
