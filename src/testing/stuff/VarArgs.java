package testing.stuff;

public class VarArgs {
	public static void main(String[] args) {
		sum(1, 2, 3, 4);
		sum(1, 2);
	}

	public static void sum(int... a) {
		int total = 0;

		// using for-each loop
		for (int i : a)
			total = total + i;

		System.out.println("The varargs sum is:" + total);
	}

	public static void sum(int a, int b) {
		System.out.println("The normal sum is:" + (a + b));
	}
}
