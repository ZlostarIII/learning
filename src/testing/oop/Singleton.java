package testing.oop;

public class Singleton {

	private static final Singleton INST = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInst() {
		return INST;
	}
	
	public void show() {
		System.out.println("Shown");
	}
}
