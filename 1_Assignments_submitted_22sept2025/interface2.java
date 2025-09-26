package interfaces;

public class interface2 implements interface1 {
	public void start() {System.out.println("Vehicle Start");}
	public void stop() {System.out.println("Vehicle Stop");}
	public static void main(String[] args) {
		interface2 m=new interface2();
		m.start();
		m.stop();
	}
}
