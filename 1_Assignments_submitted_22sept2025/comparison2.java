package guvi1;

public class comparison2 {
	
	// Compare 3 numbers

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		if(a>b&&a>c) {
			System.out.println("a is greater than b and c");
			System.out.println(a+" is greater than "+b +" and "+c);
		}
		else if(b>a&&b>c) {
			System.out.println("b is greater than a and c");
			System.out.println(b+" is greater than "+a +" and "+c);
		}
		else {
			System.out.println("c is greater than a and b");
			System.out.println(c+" is greater than "+a +" and "+b);
		}
	}

}
