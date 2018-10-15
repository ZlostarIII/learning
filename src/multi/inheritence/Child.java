package multi.inheritence;

public class Child implements Dad1, Dad2, Dad3 {

	@Override
	public void getString() {
		Dad1.super.getString();
		Dad2.super.getString();
		Dad3.super.getString();
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.getString();
	}
}
