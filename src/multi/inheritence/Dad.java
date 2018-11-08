package multi.inheritence;

public class Dad implements Dad1 {

    public int a = 10;

	public Dad() {}

	public static void parenthood() {
		System.out.println("I am the Dad");
	}

	public void speak() {
		System.out.println("Dad is speaking");
	}

	public void kickBall() {
		System.out.println("Dad kicked the ball");
	}

	public int getA() {
        System.out.println("Dad int a: " + this.a);
	    return this.a;
    }

}
