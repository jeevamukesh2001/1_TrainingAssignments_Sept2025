package inheritance;

public class animal4main {
	
	public static void main(String[] args) {
		animal2dog dog=new animal2dog();
		dog.eat();
		dog.bark();
		dog.sleep();
		
		animal3cat cat=new animal3cat();
		cat.eat();
		cat.meow();
		cat.sleep();
	}

}
