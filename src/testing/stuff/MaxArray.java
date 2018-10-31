package testing.stuff;

public class MaxArray {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4 };
		int[] b = { 1, 5, 3 };
		int[] c = new int[3];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] >= b[i] ? a[i] : b[i];
			System.out.println(c[i]);
		}

	}

}
