package testing.oop;

public abstract class Abstraction {
	
	String s;

	public Abstraction() {}
	
	public Abstraction(String s) {
		this.s = s;
	}

	public abstract void testAbstraction();
//	public abstract void testAbstraction2();
//	public abstract void testAbstraction3();

	public void setString() {
		s = "Abstraction...";
		
		System.out.println(s);
	}
}
