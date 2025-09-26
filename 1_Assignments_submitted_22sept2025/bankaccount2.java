package guvi1;

public class bankaccount2 {
	
	public static void main(String[] args) {
		bankaccount1 newacc = new bankaccount1();
		newacc.setacc_no(6279);
		newacc.setname("Jeeva");
		newacc.setbalance(1000);
		System.out.println(newacc.getacc_no()+" "+newacc.getname()+" "+newacc.getbalance()+" ");
	}
}
