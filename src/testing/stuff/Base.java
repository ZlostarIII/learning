package testing.stuff;

public class Base {
	private void fun() {
		System.out.println("Base fun");
	}

	class Derived2 extends Base {
		private void fun() {
			System.out.println("Derived fun");
		}
	}

	public static void main(String args[]) {
		Base base = new Base();
		Derived2 der = base.new Derived2();
		
		char a = 'a';
		int aa = a;
		System.out.println("Converted char is: " + aa);

		der.fun();

		// base.fun() calls Outer's fun (No run-time polymorphism).
		// base = der;
		base.fun();
	}
}
