package guvi1;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n1=sc.nextInt();
		System.out.print("Enter no. of indices : ");
		int n2=sc.nextInt();
		for(int i=1;i<=n2;i++) {
			System.out.print(n1+" * "+i+" = "+(n1*i)+"\n");
		}
	}

}
