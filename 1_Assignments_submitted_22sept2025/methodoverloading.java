package guvi1;

public class methodoverloading {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		methodoverloading m = new methodoverloading();
		System.out.println(m.add(5, 10));
		System.out.println(m.add(5, 10, 15));
	}

}
