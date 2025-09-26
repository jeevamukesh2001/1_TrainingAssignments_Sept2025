package guvi1;

public class bankaccount1 {
	
	private int acc_no;
	private int balance;
	private String name;
	public void setacc_no(int acc_no) {
		this.acc_no=acc_no;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getacc_no() {
		return acc_no;
	}
	public String getname() {
		return name;
	}
	public int getbalance() {
		return balance;
	}
	public void setbalance(int balance) {
		if(balance>0) {
			this.balance=balance;
		} else {
			this.balance=0;
		}
	}
}
