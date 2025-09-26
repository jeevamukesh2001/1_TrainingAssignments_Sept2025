package guvi1;

import java.util.Scanner;

public class digitsum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int temp = n;
        int num1 = n;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        int post=count;
        while(num1>0) {
        	int y=num1%10;
        	num1/=10;
        	if(post%2==0) System.out.print(y+" ");
            post--;
        }
    }
}
