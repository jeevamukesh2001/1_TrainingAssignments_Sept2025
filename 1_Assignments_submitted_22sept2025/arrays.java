package arrays;

public class arrays {

	public static void main(String[] args) {
		int[] numbers = {5,2,9,1,7};
		int[] n=new int[7];
		n[0]=100;
		n[1]=66;
		for(int i=0;i<=4;i++) {
			System.out.print(numbers[i]+" ");
		}
		int min=numbers[0],max=numbers[0];
		for(int num:numbers) {
			if(num>max)max=num;
			if(num<min)min=num;
		}
		System.out.println();
		System.out.println(max);
		System.out.println(min);
	}

}
