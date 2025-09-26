package collections;

public class listclass {
	String name;
	int id;
	listclass(String name1, int id1) {
		name=name1;
		id=id1;
	}
	public void display() {
		System.out.println(this.name+" "+this.id);
	}
}
