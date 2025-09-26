package loopingstatements;

import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		do {
			System.out.print(num+" ");
			num++;
		} while(num<=4);
	}

}
