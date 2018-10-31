package testing.oop;

public class AbstractionUtil extends Abstraction implements AbstractionInterface{

	public static void main(String[] args) {
		AbstractionUtil at = new AbstractionUtil();
		
		at.testAbstraction();
	}

	@Override
	public void testAbstraction() {
		System.out.println("Testing abstraction...");
		
		// Abstract class
		this.setString();
		super.setString();	// same as above
		System.out.println(this.testOverloading());
		System.out.println(this.testOverloading(2));
		
		// Interface
		this.show();
		this.draw();
		this.testStatic();
	}

	@Override
	public void draw() {
		System.out.println("Drowing interface...");
	}

	public void testStatic() {
		System.out.println("This is child static method...");
	}
	
	private int testOverloading() {
		return 1;
	}
	
	private int testOverloading(int i) {
		return i;
	}
}
