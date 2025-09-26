package switchcase;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.print("one");
			break;
		case 2:
			System.out.print("two");
			break;
		case 3:
			System.out.print("three");
			break;
		case 4:
			System.out.print("four");
			break;
		default:
			System.out.print("wrong input");
			break;
		}
	}

}
