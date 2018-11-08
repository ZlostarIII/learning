package multi.inheritence;

public class Child extends Dad implements Dad1, Dad2, Dad3 {

	@Override
	public void getString() {
		Dad1.super.getString();
		Dad1.shout();
		Dad2.super.getString();
		Dad3.super.getString();
	}
	
	public void childhood() {
		System.out.println("I am the child");
	}
	
	public void speak() {
		System.out.println("Child is speaking");
	}

	@Override
	public void kickBall() {
		System.out.println("Child kicked the ball");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.getString();
		c.speak();
		Child.parenthood();
		
		Dad d = new Dad();
		d.speak();
		Dad.parenthood();
		
		Dad d2 = new Child();
		((Child) d2).kickBall();
		d2.speak();
	}
}
