package loopingstatements;

import java.util.Scanner;

public class digitsum3 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int num1 = n;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        int post=count;
        int sum=0;
        while(num1>0) {
        	int y=num1%10;
        	num1/=10;
        	if(post%2!=0&&y%2==0) {
        		System.out.print(y+"-"+post+" ");
        		sum+=y;
        	}
            post--;
        }
        System.out.println();
        System.out.print(sum);
    }
}
