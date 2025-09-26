package guvi1;

import java.util.Scanner;

public class nonrepetitivepair {

	public static void main(String[] args) {
		int target=12;
		for(int i=1;i<=11;i++) {
			int j=target-i;
			if(i+j==target&&i<j) System.out.print(i+"&"+j+" ");
		}
	}

}
