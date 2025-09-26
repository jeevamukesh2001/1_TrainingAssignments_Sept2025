package guvi1;

import java.util.ArrayList;
import java.util.List;

public class listcollections {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Orange");
		System.out.print(a1+"\n");
		for(String a:a1) {
			System.out.println(a);
		}
		a1.remove(1);
		a1.remove(1);
		System.out.print(a1);
	}

}
