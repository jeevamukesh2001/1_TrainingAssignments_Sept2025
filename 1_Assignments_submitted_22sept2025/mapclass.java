package guvi1;

public class mapclass {
	String name;
	int id, age;
	mapclass(String name, int id, int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void display() {
		System.out.println(this.name+" "+this.id+" "+this.age);
	}
}
