package testing.oop;

public interface AbstractionInterface {
	
	public default void show() {
		System.out.println("Showing abstracion interface...");
	}
	
	public void draw();
	
	public default void testStatic() {
		System.out.println("This is parent static method");
	}
}
