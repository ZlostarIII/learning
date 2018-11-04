package testing.oop;

public abstract class Abstraction {
	
	String s;

	public Abstraction() {}
	
	public Abstraction(String s) {
		this.s = s;
	}
	
	public abstract void testAbstraction();
	
	public void setString() {
		s = "Abstraction...";
		
		System.out.println(s);
	}
}
